package corejava.task3;

import java.util.Scanner;

/**
 * pyramid using while loop
 */
public class PyramidWhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Enter the X");
        int multiplyValue = scanner.nextInt();
        int count = 0;
        int i = 0;
        while (i < num) {
            int j = 0;
            while (j <= i) {

                System.out.print(count * multiplyValue + "\t");
                count++;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
