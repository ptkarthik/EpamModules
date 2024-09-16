package collections.stack;

import java.util.*;

public class StackProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();
            System.out.println(isBalanced(input));
        }

        scanner.close();
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> matchingParentheses = new HashMap<>();
        matchingParentheses.put(')', '(');
        matchingParentheses.put('}', '{');
        matchingParentheses.put(']', '[');

        for (char c : s.toCharArray()) {
            if (matchingParentheses.containsValue(c)) {
                stack.push(c);
            } else if (matchingParentheses.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != matchingParentheses.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

