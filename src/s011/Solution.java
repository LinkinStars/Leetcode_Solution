package s011;

/**
 * @author : LinkinStar
 */
public class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = Math.min(height[start], height[end]) * (end - start);
        while (true) {
            if (height[start] < height[end]) {
                int curStart= start;
                while (start < end && height[start + 1] < height[curStart]) {
                    start++;
                }
                if (start >= end) {
                    return max;
                }
                start++;
            } else {
                int curEnd = end;
                while (start < end && height[end - 1] < height[curEnd]) {
                    end--;
                }
                if (start >= end) {
                    return max;
                }
                end--;
            }
            int temp = Math.min(height[start], height[end]) * (end - start);
            max = Math.max(max, temp);
        }
    }
    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.maxArea(new int[]{1,1});
        System.out.println(result);
    }
}
