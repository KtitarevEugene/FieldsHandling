package ru.generator.main;

import ru.generator.models.entities.entity.ktlo.invoice.InvoiceEntity;
import ru.generator.service.Generator;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("C:\\Users\\ektitarev\\Documents\\invoice_info.json")) {
            Generator generator = new Generator();

            String json = generator.getFieldsInfoJson(InvoiceEntity.class);

            fileWriter.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
