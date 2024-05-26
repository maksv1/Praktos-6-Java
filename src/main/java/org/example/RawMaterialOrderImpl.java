package org.example;

import java.io.IOException;
import java.util.logging.Level;

public class RawMaterialOrderImpl implements RawMaterialOrder {
    private static Log log;

    static {
        try {
            log = new Log("RawMaterialOrder.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void orderRawMaterials() {
        log.logger.log(Level.INFO, "Заказ сырья");
        System.out.println("Заказ сырья");
    }
}