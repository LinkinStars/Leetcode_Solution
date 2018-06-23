package s020;

import java.util.Stack;

/**
 * @author : LinkinStar
 */
public class Solution {

    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char character = s.charAt(i);
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
                continue;
            }
            switch (character) {
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }

    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isValid("[]{}()");
        System.out.println(result);
    }
}
