package s013;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : LinkinStar
 */
public class Solution {
    public int romanToInt(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int length = s.length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int cur = map.get(s.charAt(i));
            if (i + 1 < length) {
                int next = map.get(s.charAt(i + 1));
                if (cur < next) {
                    cur = next - cur;
                    i++;
                }
            }
            sum += cur;
        }
        return sum;
    }
    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.romanToInt("MCMXCIV");
        System.out.println(result);
    }
}
