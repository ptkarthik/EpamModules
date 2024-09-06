package corejava.task1;

public class ApplesProgram {
    /**
     * find apple total
     */
    public static int totalApples;

    public static int totalApplesCalculation(int a, int b) {
        return a + b;
    }

    public static double totalApplesCalculation(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("The Toal Apples are " + " " + totalApplesCalculation(3, 2));
        System.out.println("The Toal Apples are " + " " + totalApplesCalculation(3.5, 2.5));
    }
}
