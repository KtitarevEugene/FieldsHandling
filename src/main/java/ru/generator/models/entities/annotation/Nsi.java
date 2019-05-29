package ru.generator.models.entities.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Nsi {
    public enum Type {ID, CODE, NONE}

    public Class nsiClassEntity() default Object.class;

    public Type type() default Type.NONE;

    public String refField() default "";

}
