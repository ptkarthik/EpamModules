package java8.intpredicate;

import java.util.function.IntConsumer;

public class SquareOfNumbers {
    public static void main(String[] args) {
        IntConsumer a= num -> {

             System.out.println("Square: " + (num * num));
        };
        a.accept(7);

    }
}
