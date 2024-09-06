package corejava.task2;

import java.util.Scanner;

/**
 * Calculator program
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter the Operation");
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "%":
                System.out.println("The Reminder is"+" "+a % b);
                break;
            case "$":
                System.out.println("The percentage is"+" "+(a / b)*100);
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }
}
