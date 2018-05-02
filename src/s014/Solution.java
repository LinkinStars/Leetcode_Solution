package s014;

/**
 * @author : LinkinStar
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            //note: when the result is not exist in the str then the indexof will return -1
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }

    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] a = {"flower","flow","flight"};
        String result = solution.longestCommonPrefix(a);
        System.out.println(result);
    }
}
