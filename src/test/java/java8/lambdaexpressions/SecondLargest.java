package java8.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {

    public static Integer secondLargest(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 4, 45, 99, 99, 4, 20);

        Integer secondLargest = secondLargest(numbers);

        if (secondLargest != null) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("There is no second largest number.");
        }
    }
}