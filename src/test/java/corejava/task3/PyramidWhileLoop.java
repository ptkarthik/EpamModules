package corejava.task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * pyramid using while loop
 */
public class PyramidWhileLoop {
    public static final Logger logger = LogManager.getLogger(PyramidWhileLoop.class);

    public static void main(String[] args) {
        logger.info("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        logger.info("Enter the X");
        int multiplyValue = scanner.nextInt();
        int count = 0;
        int i = 0;
        while (i < num) {
            int j = 0;
            while (j <= i) {
                System.out.print(count * multiplyValue + "\t");
                count++;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
