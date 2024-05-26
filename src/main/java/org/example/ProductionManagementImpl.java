package org.example;

import java.io.IOException;
import java.util.logging.Level;

public class ProductionManagementImpl implements ProductionManagement {
    private static Log log;

    static {
        try {
            log = new Log("ProductionManagement.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void manageProduction() {
        log.logger.log(Level.INFO, "Управление производством");
        System.out.println("Управление производством");
    }
}
