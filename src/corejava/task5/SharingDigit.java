package corejava.task5;

public class SharingDigit {
    public static boolean shareDigit(int num1, int num2) {
        int num1LeftDigit = num1 / 10;
        int num1RightDigit = num1 % 10;

        int num2LeftDigit = num2 / 10;
        int num2RightDigit = num2 % 10;

        return (num1LeftDigit == num2LeftDigit || num1LeftDigit == num2RightDigit ||
                num1RightDigit == num2LeftDigit || num1RightDigit == num2RightDigit);
    }

    public static void main(String[] args) {
        System.out.println(shareDigit(12, 23));
        System.out.println(shareDigit(12, 43));
        System.out.println(shareDigit(12, 44));
    }
}

