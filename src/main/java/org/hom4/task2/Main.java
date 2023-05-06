package org.hom4.task2;

public class Main {
    /**
     * https://leetcode.com/problems/valid-parentheses/
     * Given a string s containing just the characters
     * '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * <p>
     * An input string is valid if:
     * <p>
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     */

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        System.out.println(s);
        if (s.length() % 2 != 0
                || s.charAt(0) == ')'
                || s.charAt(0) == '}'
                || s.charAt(0) == ']') {
            return false;
        }
        for (int i = 0; i < s.length(); i += 2) {
            if (!(((s.charAt(i) == '(') && (s.charAt(i + 1) == ')'))
                    || ((s.charAt(i) == '{') && (s.charAt(i + 1) == '}'))
                    || ((s.charAt(i) == '[') && (s.charAt(i + 1) == ']')))) {
                return false;
            }
        }
        return true;
    }
}
