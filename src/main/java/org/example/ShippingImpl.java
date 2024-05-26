package org.example;

import java.io.IOException;
import java.util.logging.Level;

public class ShippingImpl implements Shipping {
    private static Log log;

    static {
        try {
            log = new Log("Shipping.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void shipItem(String itemName, int quantity) {
        log.logger.log(Level.INFO, "Отгрузка товара: " + itemName + ", количество: " + quantity);
        System.out.println("Отгрузка товара: " + itemName + ", количество: " + quantity);
    }
}
