package java8.lambdaexpressions;

import java.util.stream.IntStream;

public class NumberPrinting implements Runnable {

    @Override
    public void run() {
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Runnable numberPrinter = new NumberPrinting();
        Thread thread = new Thread(numberPrinter);
        thread.start();
    }
}