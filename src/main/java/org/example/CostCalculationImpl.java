package org.example;

import java.io.IOException;
import java.util.logging.Level;

public class CostCalculationImpl implements CostCalculation {
    private static Log log;

    static {
        try {
            log = new Log("CostCalculation.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calculateProductionCost(String itemName) {
        log.logger.log(Level.INFO, "Расчет себестоимости товара: " + itemName);
        System.out.println("Расчет себестоимости товара: " + itemName);
    }
}
