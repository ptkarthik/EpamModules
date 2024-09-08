package java8.lambdaexpressions;

import java.util.*;

class EmployeeOne {
    String name;
    int id;

    EmployeeOne(String name, int id) {
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

public class TreeSetSortingUsingEmployeeName {
    public static void main(String[] args) {
        Set<EmployeeOne> employees = new TreeSet<>(Comparator.comparing(EmployeeOne::getName));
        employees.add(new EmployeeOne("John", 3));
        employees.add(new EmployeeOne("Alice", 1));
        employees.add(new EmployeeOne("Bob", 2));
        System.out.println(employees);
    }
}
