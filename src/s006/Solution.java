package s006;

/**
 * @author : LinkinStar
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows <= 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        int index = 0;
        while (index < length) {
            sb.append(s.charAt(index));
            index += (numRows*2 - 2);
        }
        for (int i = 1; i < numRows - 1; i++) {
            index = i;
            int curRow = numRows - i;
            while (index < length) {
                sb.append(s.charAt(index));
                int temp = index + curRow * 2 - 2;
                if (temp >= length) {
                    break;
                }
                sb.append(s.charAt(temp));
                index += (numRows*2 - 2);
            }
        }
        index = numRows - 1;
        while (index < length) {
            sb.append(s.charAt(index));
            index += (numRows*2 - 2);
        }
        return sb.toString();
    }
    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.convert("ABCDEFGHI", 4);
        System.out.println(result);
    }
}
