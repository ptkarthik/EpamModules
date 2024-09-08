package corejava.task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * pyramid using for loop
 */
public class PyramidForLoop {
    public static final Logger logger = LogManager.getLogger(PyramidForLoop.class);

    public static void main(String[] args) {
        logger.info("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        logger.info("Enter the X");
        int multiplyValue = scanner.nextInt();
        int count =0;
        for(int i=0;i<num;i++) {
            for(int j=0;j<=i;j++,count++) {
                System.out.print(count*multiplyValue+"\t");
            }
            System.out.println();
        }
    }
}
