package java8.predicates;

import java.util.ArrayList;
import java.util.List;

public class ElectronicCategoryProduct {
    public static void main(String[] args) {
        Product lollipop = new Product("TV", 100, "Electronics", "A");
        Product cakes = new Product("Cake", 900, "Cakes", "A");
        Product Table = new Product("Cake", 900, "Furniture", "A");
        Product mobile = new Product("mobile", 10000, "Electronics", "A");
        List<Product> products = new ArrayList<>();
        products.add(lollipop);
        products.add(cakes);
        products.add(Table);
        products.add(mobile);
        findProductWithElectronic(products);
        findProductWithElectronicGreaterThan100(products);
        findProductWithElectronicOrGreaterThan100(products);
        findProductWithElectronicAndLessThan100(products);
    }



    private static void findProductWithElectronic(List<Product> products) {
        products.stream().filter(product -> product.getCategory().equalsIgnoreCase("Electronics")).
                forEach(product ->
                        System.out.println(product.getName())
                );
    }

    private static void findProductWithElectronicGreaterThan100(List<Product> products) {
        products.stream().filter(product -> product.getCategory().equalsIgnoreCase("Electronics") && product.getPrice() > 100).

                forEach(product ->
                        System.out.println(product.getName())
                );
    }

    private static void findProductWithElectronicOrGreaterThan100(List<Product> products) {
        products.stream().filter(product -> product.getCategory().equalsIgnoreCase("Electronics")
                        || product.getPrice() > 100).

                forEach(product ->
                        System.out.println(product.getName())
                );
    }

    private static void findProductWithElectronicAndLessThan100(List<Product> products) {
        products.stream().filter(product -> product.getCategory().equalsIgnoreCase("Electronics")
                        && product.getPrice() < 100).

                forEach(product ->
                        System.out.println(product.getName())
                );
    }

}
