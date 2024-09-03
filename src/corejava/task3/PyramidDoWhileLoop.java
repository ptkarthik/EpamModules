package corejava.task3;

import java.util.Scanner;

public class PyramidDoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Enter the X");
        int multiplyValue = scanner.nextInt();
        int row=0;

        int value = 0;
        do {
            int column = 0;
            do {
                System.out.print(value * multiplyValue + "\t");
                value++;
                column++;
            }
            while (column <= row);
            System.out.println();
            row++;
        }
        while (row < num);


    }
    }

