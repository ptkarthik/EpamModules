package java8.lambdaexpressions;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }
}

public class SortEmployeesByName {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 3),
                new Employee("Alice", 1),
                new Employee("Bob", 2)
        );

        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println(sortedEmployees);
    }
}
