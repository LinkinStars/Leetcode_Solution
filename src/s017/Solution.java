package s017;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : LinkinStar
 */
public class Solution {

    char[][] map = {
            {'0'},
            {'1'},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'},
    };

    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        int length = digits.length();
        result.add("");
        for (int i = 0; i < length; i++) {
            int curCh = digits.charAt(i) - '0';
            char[] curArr = map[curCh];
            String temp;
            while (result.peek().length() == i) {
                temp = result.poll();
                for (int j = 0; j < curArr.length; j++) {
                    result.add(temp + curArr[j]);
                }
            }
        }
        return result;
    }

    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        String digits = "23";
        List<String> result = solution.letterCombinations(digits);
        for (String temp : result) {
            System.out.println(temp);
        }
    }
}
