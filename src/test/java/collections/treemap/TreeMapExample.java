package collections.treemap;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases

        StringBuilder result = new StringBuilder();

        while (T-- > 0) {
            int Q = sc.nextInt();  // Number of queries
            sc.nextLine(); // Consume the newline character

            TreeMap<Integer, Integer> treeMap = new TreeMap<>();

            String[] queries = sc.nextLine().split(" ");
            int i = 0;
            while (i < queries.length) {
                String queryType = queries[i];

                switch (queryType) {
                    case "a":
                        int key = Integer.parseInt(queries[++i]);
                        int value = Integer.parseInt(queries[++i]);
                        treeMap.put(key, value);
                        break;

                    case "b":
                        key = Integer.parseInt(queries[++i]);
                        result.append(treeMap.getOrDefault(key, -1)).append(" ");
                        break;

                    case "c":
                        result.append(treeMap.size()).append(" ");
                        break;

                    case "d":
                        key = Integer.parseInt(queries[++i]);
                        treeMap.remove(key);
                        break;

                    case "e":
                        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                            result.append(entry.getKey()).append(" ").append(entry.getValue()).append(" ");
                        }
                        break;
                }
                i++;
            }
            result.append("\n");
        }

        System.out.print(result.toString().trim());
        sc.close();
    }
}
