package java8.lambdaexpressions;

import java.util.*;

public class TreeSetReverseOrder {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());
        numbers.addAll(Arrays.asList(5, 2, 9, 1, 5, 6));
        System.out.println(numbers);
    }
}
