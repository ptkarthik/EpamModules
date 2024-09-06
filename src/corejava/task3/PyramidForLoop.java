package corejava.task3;

import java.util.Scanner;

/**
 * pyramid using for loop
 */
public class PyramidForLoop {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Enter the X");
        int multiplyValue = scanner.nextInt();
        int count =0;
        for(int i=0;i<num;i++) {
            for(int j=0;j<=i;j++,count++) {
                System.out.print(count*multiplyValue+"\t");
            }
            System.out.println();
        }
    }
}
