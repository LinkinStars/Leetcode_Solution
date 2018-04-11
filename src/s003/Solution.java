package s003;

import java.util.Arrays;

/**
 * @author : LinkinStar
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int[] characterIndex = new int[256];
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            start = Math.max(start, characterIndex[temp]);
            result = Math.max(result, i - start + 1);
            characterIndex[temp] = i + 1;
        }
        return result;
    }
    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("abcabcbb");
        System.out.println(result);
    }
}
