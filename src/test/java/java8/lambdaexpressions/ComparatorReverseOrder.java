package java8.lambdaexpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorReverseOrder {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 5, 6);
            List<Integer> sortedNumbers = numbers.stream() // converting to Strem and it returns Strem
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
            System.out.println(sortedNumbers);
        }
    }

