package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading number of lines
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();

        // Reading each line of integers
        for (int i = 0; i < n; i++) {
            int numOfIntegers = sc.nextInt();  // Number of integers in the line
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < numOfIntegers; j++) {
                list.add(sc.nextInt());
            }
            listOfLists.add(list);
        }

        // Reading number of queries
        int q = sc.nextInt();

        // Processing each query
        for (int i = 0; i < q; i++) {
            int lineNumber = sc.nextInt();
            int position = sc.nextInt();

            // Checking if the lineNumber and position are valid
            if (lineNumber <= listOfLists.size() && lineNumber > 0) {
                ArrayList<Integer> line = listOfLists.get(lineNumber - 1);  // lineNumber is 1-based
                if (position <= line.size() && position > 0) {
                    System.out.println(line.get(position - 1));  // position is 1-based
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}
