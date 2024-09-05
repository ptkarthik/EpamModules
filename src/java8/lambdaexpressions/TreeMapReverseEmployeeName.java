package java8.lambdaexpressions;

import java.util.*;
import java.util.stream.Collectors;


public class TreeMapReverseEmployeeName {
    public static void main(String[] args) {
        Map<Integer, Employee> map = new TreeMap<>();
        map.put(1, new Employee("John", 3));
        map.put(2, new Employee("Alice", 1));
        map.put(3, new Employee("Bob", 2));

        List<Map.Entry<Integer, Employee>> sortedEntries = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName).reversed()))
                .collect(Collectors.toList());

        Map<Integer, Employee> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Employee> entry : sortedEntries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(sortedMap);
    }
}
