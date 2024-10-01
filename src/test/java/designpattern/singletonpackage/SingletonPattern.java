package designpattern.singletonpackage;

public class SingletonPattern {
    public static void main(String[] args) {
        // Get the singleton instance of CandyMaker
        CandyMaker candyMaker = CandyMaker.getInstance();

        // Fill the candy maker
        candyMaker.fill();
        System.out.println("CandyMaker filled: " + !candyMaker.isEmpty());

        // Boil the mixture
        candyMaker.boil();
        System.out.println("CandyMaker boiled: " + candyMaker.isBoiled());

        // Drain the candy maker
        candyMaker.drain();
        System.out.println("CandyMaker empty: " + candyMaker.isEmpty());
    }
}