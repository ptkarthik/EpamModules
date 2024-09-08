package java8.lambdaexpressions;

import java.util.stream.IntStream;

public class RotationOfStrings {

    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String combinedString = s1 + s1;
        return IntStream.range(0, s2.length())
                .anyMatch(i -> combinedString.startsWith(s2, i));
    }

    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "cdefab";

        System.out.println("Are the strings rotations of each other? " + areRotations(s1, s2));
    }
}