package s009;

/**
 * @author : LinkinStar
 */
public class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int start = 0;
        int end = num.length() - 1;
        while (start < end) {
            if (num.charAt(start) != num.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(-111121111);
        System.out.println(result);
    }
}
