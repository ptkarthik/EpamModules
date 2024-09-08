package corejava.task4.arrays;

import corejava.task3.PyramidWhileLoop;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * to fidn the missing number in array
 */
public class MissingNumber {
    public static final Logger logger = LogManager.getLogger(MissingNumber.class);

    public static void main(String[] args) {
        Integer countTwo = 0;

        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            countTwo += arr[i];
        }

        logger.info("Count of Array1"+" "+countTwo);
        Integer countOne=findTheMissingNumber(99, arr);
        logger.info("Count of Array2"+" "+countOne);
        logger.info("Missing Number "+ " "+ "is"+" "+(countTwo-countOne));

    }

    private static Integer findTheMissingNumber(int i, Integer[] arr) {
        int countOne = 0;
        List<Integer> newList = new ArrayList<Integer>();
        List<Integer> listOfInt = Arrays.asList(arr);
        for (Integer d : listOfInt) {
            if (i != d) {
                countOne+=d;
            }
        }
        return countOne;
    }

}
