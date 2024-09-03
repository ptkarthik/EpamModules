package corejava.task4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        Integer countTwo = 0;

        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            countTwo += arr[i];
        }

        System.out.println("Count of Array1"+" "+countTwo);
        Integer countOne=findTheMissingNumber(99, arr);
        System.out.println("Count of Array2"+" "+countOne);
        System.out.println("Missing Number "+ " "+ "is"+" "+(countTwo-countOne));

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
