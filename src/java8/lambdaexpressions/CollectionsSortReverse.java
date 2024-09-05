package java8.lambdaexpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CollectionsSortReverse {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 3),
                new Employee("Alice", 1),
                new Employee("Bob", 2)
        );

        Collections.sort(employees, Comparator.comparing(Employee::getName).reversed());
        System.out.println(employees);
    }
}
