package s010;

/**
 * @author : LinkinStar
 */
public class Solution {
    public boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()){
            return text.isEmpty();
        }

        boolean firstMatch = false;
        if (!text.isEmpty()) {
            if (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.') {
                firstMatch = true;
            }
        }

        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            return (isMatch(text, pattern.substring(2)) ||
                    (firstMatch && isMatch(text.substring(1), pattern)));
        } else {
            return firstMatch && isMatch(text.substring(1), pattern.substring(1));
        }
    }
    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isMatch("aaa", ".aa");
        System.out.println(result);
    }
}
