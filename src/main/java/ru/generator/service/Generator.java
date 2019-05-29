package ru.generator.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;
import ru.generator.models.FieldInfo;
import ru.generator.service.annotations.*;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

public class Generator {

    private static final String PRIMITIVE_INTEGER_NAME = "int";
    private static final String PRIMITIVE_CHARACTER_NAME = "char";

    public String getFieldsInfoJson(Class<?> modelType) throws JsonProcessingException {
        List<FieldInfo> fieldsInfo = getFieldsInfoList(modelType);

        return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(fieldsInfo);
    }

    private List<FieldInfo> getFieldsInfoList (@NotNull Class<?> modelType) {

        List<FieldInfo> fieldsInfo = new ArrayList<>();

        recursive(modelType, "", fieldsInfo);

        return fieldsInfo;
    }

    private void recursive(@NotNull Class<?> modelType, @NotNull String pathPrefix, @NotNull List<FieldInfo> fieldsInfo) {

        Field[] fields = modelType.getDeclaredFields();
        for (Field field : fields) {
            if (!isIgnored(field)) {

                FieldInfo fieldInfo = new FieldInfo();

                fieldInfo.setHeaderName(getFieldHeaderName(field));
                fieldInfo.setField(pathPrefix + getFieldName(field));
                fieldInfo.setImportant(isImportant(field));

                setFieldType(field, fieldInfo, fieldsInfo);
            }
        }
    }

    private boolean isIgnored(@NotNull Field field) {
        return field.getAnnotation(IgnoreField.class) != null;
    }

    @NotNull
    private String getFieldHeaderName (@NotNull Field field) {
        Description annotation = field.getAnnotation(Description.class);
        if (annotation != null) {
            return annotation.value();
        }

        return "";
    }

    @NotNull
    private String getFieldName(@NotNull Field field) {
        FieldName fieldNameAnnotation = field.getAnnotation(FieldName.class);
        if (fieldNameAnnotation != null) {
            return fieldNameAnnotation.value();
        }

        return field.getName();
    }

    private boolean isImportant(@NotNull Field field) {
        return field.getAnnotation(IsImportant.class) != null;
    }

    private void setFieldType (@NotNull Field field, @NotNull FieldInfo fieldInfo, @NotNull List<FieldInfo> fieldsInfo) {
        ModelClass modelClassAnnotation = field.getAnnotation(ModelClass.class);
        if (modelClassAnnotation == null) {
            fieldInfo.setType(getActualTypeSimpleName(field));

            fieldsInfo.add(fieldInfo);
        } else {
            fieldInfo.setType(modelClassAnnotation.fieldTypeName());

            fieldsInfo.add(fieldInfo);

            recursive(modelClassAnnotation.value(), fieldInfo.getField() + ".", fieldsInfo);
        }
    }

    @NotNull
    private String getActualTypeSimpleName(@NotNull Field field) {

        Type fieldType = field.getGenericType();

        if (fieldType instanceof ParameterizedType) {
            if (Iterable.class.isAssignableFrom(field.getType())) {
                Type genericArgument = ((ParameterizedType) fieldType).getActualTypeArguments()[0];

                return ((Class<?>)genericArgument).getSimpleName().toLowerCase();
            } else if (Map.class.isAssignableFrom(field.getType())) {
                Type genericArgument = ((ParameterizedType) fieldType).getActualTypeArguments()[1];

                return ((Class<?>)genericArgument).getSimpleName().toLowerCase();
            } else {
               return field.getType().getSimpleName().toLowerCase();
            }
        } else {
            return normalizeSimpleTypeName(field.getType().getSimpleName()).toLowerCase();
        }
    }

    private String normalizeSimpleTypeName(String typeName) {
        if (PRIMITIVE_INTEGER_NAME.equalsIgnoreCase(typeName)) {
            return Integer.class.getSimpleName();
        } else if (PRIMITIVE_CHARACTER_NAME.equalsIgnoreCase(typeName)) {
            return Character.class.getSimpleName();
        } else {
            return typeName;
        }
    }
}
