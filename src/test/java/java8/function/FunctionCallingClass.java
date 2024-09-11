package java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCallingClass {
    public static void main(String[] args) {
        List<ProductClass> productClassLists = new ArrayList<>();
        ProductClass mobile = new ProductClass("Redmi", 15999, "Electronics", "B");

        ProductClass tv = new ProductClass("Mi TV", 24999, "Electronics", "B");
        ProductClass headSet = new ProductClass("JBL HeadSets", 999, "Electronics", "B");

        ProductClass soap = new ProductClass("Soap", 54.23, "Detergent", "B");
        ProductClass biscuit = new ProductClass("Biscuit", 100.85, "Eatables", "A");
        ProductClass bread = new ProductClass("Bread", 34.00, "Eatables", "A");
        ProductClass shampoo = new ProductClass("Silky", 09.99, "Shampoo", "A");
        ProductClass coke = new ProductClass("Coke", 15.00, "Beverages", "A");
        ProductClass pampers = new ProductClass("Coke", 1050.99, "Baby Products", "A");
        ProductClass bpMonitor = new ProductClass("Coke", 3200, "Health Instrument", "A");
        ProductClass chilliPowder = new ProductClass("Aachi Chilli Powder",
                6.00, "Spices", "A");
        productClassLists.add(soap);
        productClassLists.add(biscuit);
        productClassLists.add(bread);
        productClassLists.add(headSet);
        productClassLists.add(shampoo);
        productClassLists.add(mobile);
        productClassLists.add(tv);
        productClassLists.add(coke);
        productClassLists.add(chilliPowder);
        productClassLists.add(pampers);
        productClassLists.add(bpMonitor);

        totalValueOfProducts(productClassLists);
        totalValueOfProductsGreaterThan1000(productClassLists);
        totalValueOfProductsElectronics(productClassLists);
        totalValueOfProductsElectronicsGreaterThan1000(productClassLists);

    }

    private static void totalValueOfProductsGreaterThan1000(List<ProductClass> productClassLists) {
        Function<List<ProductClass>, Double> valueForGreaterThan1000 = products -> {
            double total = 0;
            for (ProductClass p : products) {
                if (p.getPrice() > 1000) {
                    total += p.getPrice();
                }
            }
            return total;
        };
        System.out.println(valueForGreaterThan1000.apply(productClassLists));
    }

    private static void totalValueOfProductsElectronics(List<ProductClass> productClassLists) {
        Function<List<ProductClass>, Double> valueForElectronicsOnly = products -> {
            double total = 0;
            for (ProductClass p : products) {
                if (p.getCategory().equalsIgnoreCase("Electronics")) {
                    total += p.getPrice();
                }
            }
            return total;
        };
        System.out.println(valueForElectronicsOnly.apply(productClassLists));
    }

    private static void totalValueOfProductsElectronicsGreaterThan1000(List<ProductClass> productClassLists) {
        Function<List<ProductClass>, Double> valueForElectronicsOnly = products -> {
            double total = 0;
            for (ProductClass p : products) {
                if (p.getCategory().equalsIgnoreCase("Electronics") && p.getPrice() > 1000) {
                    total += p.getPrice();
                }
            }
            return total;
        };
        System.out.println(valueForElectronicsOnly.apply(productClassLists));
    }


    private static void totalValueOfProducts(List<ProductClass> productClassLists) {

        Function<List<ProductClass>, Double> getTotalPrice = products -> {
            double total = 0;
            for (ProductClass product : products) {
                total += product.getPrice();  // Summing up prices of all products in the list
            }
            return total;  // Returning the total value
        };

        Double total = getTotalPrice.apply(productClassLists);
        System.out.println(total);
    }


}
