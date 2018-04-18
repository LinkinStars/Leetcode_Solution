package s008;

/**
 * @author : LinkinStar
 */
public class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        }
        char firstCh = str.charAt(0);
        StringBuilder number = new StringBuilder();
        int index = 0;
        switch (firstCh) {
            case '-':
                number.append("-");
                index++;
                break;
            case '+':
                index++;
                break;
            default:
                if (!Character.isDigit(firstCh)){
                    return 0;
                }
        }
        if (index == 1) {
            if (str.length() == 1) {
                return 0;
            }
            if(!Character.isDigit(str.charAt(1))) {
                return 0;
            }
        }
        for (int i = index; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))){
                break;
            }
            number.append(str.charAt(i));
        }
        if (number.length() > 11) {
            if (number.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        long l = Long.valueOf(number.toString());
        if (l > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (l < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(number.toString());
    }
    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.myAtoi("+1");
        System.out.println(result);
    }
}
