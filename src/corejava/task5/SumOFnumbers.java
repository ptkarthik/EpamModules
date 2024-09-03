package corejava.task5;

public class SumOFnumbers {

    public static int sumNumbers(String str) {
        int sum = 0;
        int currentNumber = 0;
        boolean inNumber = false;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Start or continue a number
                currentNumber = currentNumber * 10 + (ch - '0');
                inNumber = true;
            } else {
                // End of a number
                if (inNumber) {
                    sum += currentNumber;
                    currentNumber = 0;
                    inNumber = false;
                }
            }
        }

        // Add the last number if the string ends with digits
        if (inNumber) {
            sum += currentNumber;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sumNumbers("abc123xyz"));  // Should print 123
        System.out.println(sumNumbers("aa11b33"));    // Should print 44
        System.out.println(sumNumbers("7 11"));       // Should print 18
    }
}
