package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProductionImpl production = new ProductionImpl();
        ShippingImpl shipping = new ShippingImpl();
        CostCalculationImpl costCalculation = new CostCalculationImpl();
        ProductionManagementImpl productionManagement = new ProductionManagementImpl();
        QualityInspectionImpl qualityInspection = new QualityInspectionImpl();
        RawMaterialOrderImpl rawMaterialOrder = new RawMaterialOrderImpl();
        
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Производство товара");
            System.out.println("2. Отгрузка товара");
            System.out.println("3. Расчет себестоимости товара");
            System.out.println("4. Управление производством");
            System.out.println("5. Проверка качества товара");
            System.out.println("6. Заказ сырья");
            System.out.println("0. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Введите название товара для производства:");
                    String itemName = scanner.nextLine();
                    production.produceItem(itemName);
                    break;
                case 2:
                    System.out.println("Введите название товара для отгрузки:");
                    String shippedItem = scanner.nextLine();
                    System.out.println("Введите количество:");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    shipping.shipItem(shippedItem, quantity);
                    break;
                case 3:
                    System.out.println("Введите название товара для расчета себестоимости:");
                    String costItem = scanner.nextLine();
                    costCalculation.calculateProductionCost(costItem);
                    break;
                case 4:
                    productionManagement.manageProduction();
                    break;
                case 5:
                    System.out.println("Введите название товара для проверки качества:");
                    String qualityItem = scanner.nextLine();
                    qualityInspection.inspectQuality(qualityItem);
                    break;
                case 6:
                    rawMaterialOrder.orderRawMaterials();
                    break;
                default:
                    System.out.println("Некорректный выбор");
            }
        }

        scanner.close();
    }
}