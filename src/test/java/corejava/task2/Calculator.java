package corejava.task2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Calculator program
 */
public class Calculator {
    public static Logger logger = LogManager.getLogger(Calculator.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        logger.info("Enter the first number: ");
        double a = sc.nextDouble();
        logger.info("Enter the second number: ");
        double b = sc.nextDouble();
        logger.info("Enter the Operation");
        String op = sc.next();
        switch (op) {
            case "+":
                logger.info(a + b);
                break;
            case "-":
                logger.info(a - b);
                break;
            case "*":
                logger.info(a * b);
                break;
            case "/":
                logger.info(a / b);
                break;
            case "%":
                logger.info("The Reminder is" + " " + a % b);
                break;
            case "$":
                logger.info("The percentage is" + " " + (a / b) * 100);
                break;
            default:
                logger.info("Invalid Operation");
                break;
        }
    }
}
