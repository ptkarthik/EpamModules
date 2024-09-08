package corejava.task4.arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Random;

/**
 * to find the smallest and largest
 */
public class SmallestAndLargest {
    public static final Logger logger = LogManager.getLogger(SmallestAndLargest.class);

    public static void main(String[] args) {
        Integer[] a = new Integer[10];
        Integer[] b = new Integer[10];

        for(int i = 0; i < a.length; i++) {
            Random random = new Random();
            a[i] = random.nextInt(100);
        }
       logger.info("The Integer Array 1"+" "+Arrays.toString(a));
        findTheSmallest(a);
        findTheLargest(b);
    }

    private static void findTheLargest(Integer[] b) {
        for(int i = 0; i < b.length; i++) {
            Random random = new Random();
            b[i] = random.nextInt(100);
        }
        logger.info("The Integer Array 1"+" "+Arrays.toString(b));
        Integer largest = b[0];
        for(int i = 0; i < b.length; i++) {
            if(b[i] > largest) {
                largest = b[i];
            }
        }
        logger.info("the Largest is "+" "+largest);
    }

    private static void findTheSmallest(Integer[] a) {
        Integer smallest = a[0];
        for(int i = 1; i < a.length; i++) {
            if(a[i] < smallest) {
                smallest = a[i];
            }
        }
        logger.info("The smallest is "+" "+smallest);
    }
}
