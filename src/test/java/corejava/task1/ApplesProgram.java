package corejava.task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ApplesProgram {

    private static final Logger logger = LogManager.getLogger(ApplesProgram.class);
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
        logger.info("The Toal Apples are " + " " + totalApplesCalculation(3, 2));
        logger.info("The Toal Apples are " + " " + totalApplesCalculation(3.5, 2.5));
    }
}
