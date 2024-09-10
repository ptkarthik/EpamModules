package java8.consumer;

import java8.function.ProductClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;



    public class ProductNameSuffixStar {
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
            Consumer<Object> consumer= productClass->System.out.println(productClass);
            for(ProductClass productClass : productClassLists) {
                if(productClass.getPrice()>3000) {
                    productClass.setName(productClass.getName());
                    consumer.accept(productClass.toString());
                }
            }

        }
    }


