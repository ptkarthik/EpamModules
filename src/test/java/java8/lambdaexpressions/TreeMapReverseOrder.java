package java8.lambdaexpressions;

import java.util.*;

public class TreeMapReverseOrder {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map);
    }
}
