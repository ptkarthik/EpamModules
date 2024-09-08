package corejava.task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Pyramid Do while loop
 */
public class PyramidDoWhileLoop {
    public static final Logger logger = LogManager.getLogger(PyramidDoWhileLoop.class);

    public static void main(String[] args) {
        logger.info("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        logger.info("Enter the X");
        int multiplyValue = scanner.nextInt();
        int row = 0;

        int value = 0;
        do {
            int column = 0;
            do {
                System.out.print(value * multiplyValue + "\t");
                value++;
                column++;
            }
            while (column <= row);
            System.out.println();
            row++;
        }
        while (row < num);


    }
}

