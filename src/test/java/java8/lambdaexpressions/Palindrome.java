package java8.lambdaexpressions;

import java.util.stream.IntStream;

/**
 * Check if a given string is a palindrome
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkStringIsPalindromeOrNot("kaaak"));
        System.out.println(checkStringIsPalindromeLambda("kaaak"));

    }

    private static boolean checkStringIsPalindromeLambda(String str) {
        int length = str.length();
        return IntStream.range(0, length / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(length - 1 - i));
    }


    private static boolean checkStringIsPalindromeOrNot(String stringData) {
        String stringOne = stringData.toLowerCase();
        for (int i = 0; i < stringData.length() / 2; i++)
            if (stringOne.charAt(i) != stringOne.charAt(stringData.length() - i - 1)) {
                return false;
            }
        return true;
    }

}
