package org.example;

import java.io.IOException;
import java.util.logging.Level;

public class QualityInspectionImpl implements QualityInspection {
    private static Log log;

    static {
        try {
            log = new Log("QualityInspection.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inspectQuality(String itemName) {
        log.logger.log(Level.INFO, "Проверка качества товара: " + itemName);
        System.out.println("Проверка качества товара: " + itemName);
    }
}
