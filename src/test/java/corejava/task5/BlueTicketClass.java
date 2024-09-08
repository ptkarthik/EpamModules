package corejava.task5;

public class BlueTicketClass {

    public static int determineResult(int a, int b, int c) {

        int sumAB = a + b;
        int sumBC = b + c;
        int sumAC = a + c;


        if (sumAB == 10 || sumBC == 10 || sumAC == 10) {
            return 10;
        }


        if (sumAB == sumBC + 10 || sumAB == sumAC + 10) {
            return 5;
        }

        return 0;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 7;
        int c = 4;

        int result = determineResult(a, b, c);
        System.out.println("The result is: " + result);
    }
}



