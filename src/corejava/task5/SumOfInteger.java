package corejava.task5;

public class SumOfInteger {

    public static int sumLimit(int a, int b) {
        int sum = a + b;

        String strA = String.valueOf(a);
        String strSum = String.valueOf(sum);

        if (strSum.length() == strA.length()) {
            return sum;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumLimit(2, 3));
        System.out.println(sumLimit(8, 3));
        System.out.println(sumLimit(8, 1));
    }
}
