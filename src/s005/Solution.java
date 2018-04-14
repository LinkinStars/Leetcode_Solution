package s005;

/**
 * @author : LinkinStar
 */
public class Solution {

    private int maxLength = 0;
    private int strLength = 0;
    private int resultStart = 0;

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        strLength = s.length();
        for (int i = 0; i < strLength - 1; i++) {
            extend(s, i, i);
            extend(s, i, i + 1);
        }
        return s.substring(resultStart, resultStart + maxLength);
    }

    private void extend(String str, int indexStart, int indexEnd){
        while (indexStart >= 0
                && indexEnd < strLength
                && str.charAt(indexStart) == str.charAt(indexEnd)) {
            indexStart--;
            indexEnd++;
        }
        if (indexEnd - indexStart - 1 > maxLength) {
            maxLength = indexEnd - indexStart - 1;
            resultStart = indexStart + 1;
        }
    }

    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("babad");
        System.out.println(result);
    }
}
