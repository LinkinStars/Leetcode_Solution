package s007;

/**
 * @author : LinkinStar
 */
public class Solution {
    public int reverse(int x) {
        long result = 0;
        long num = (long) x;
        while (num != 0){
            result *= 10;
            result += num % 10;
            num /= 10;
        }
        int test = (int) result;
        if (test == result) return test;
        return 0;
    }
    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.reverse(2147483647);
        System.out.println(result);
    }
}
