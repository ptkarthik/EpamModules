package java8.bifunction;

import java8.predicates.Product;

import java.util.function.BiFunction;

public class CreateAProduct {
    public static void main(String[] args) {
        BiFunction<String, Double, Product> biGunction =
                (name, price) -> new Product(name, price, "Electronics", "A");
        System.out.println(biGunction.apply("Iphone 15 Max Pro", 149000.00).toString());
    }
}
