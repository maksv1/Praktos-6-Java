package org.example;

import java.io.IOException;
import java.util.logging.Level;

public class ProductionImpl implements Production {
    private static Log log;

    static {
        try {
            log = new Log("Production.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void produceItem(String itemName) {
        log.logger.log(Level.INFO, "Производство товара: " + itemName);
        System.out.println("Производство товара: " + itemName);
    }
}
