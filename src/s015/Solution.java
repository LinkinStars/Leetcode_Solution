package s015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : LinkinStar
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (nums.length < 3) {
            return resultList;
        }
        Arrays.sort(nums);
        int index = 0;
        int start = 0;
        int end = 0;
        int sum = 0;
        while (index < nums.length - 2) {
            if (nums[index] > 0) {
                break;
            }
            start = index + 1;
            end = nums.length - 1;
            while (start < end) {
                sum = nums[index] + nums[start] + nums[end];
                if (sum == 0) {
                    resultList.add(Arrays.asList(nums[index], nums[start], nums[end]));
                }
                if (sum <= 0) {
                    while (nums[start] == nums[++start] && start < end);
                }
                if (sum >= 0) {
                    while (nums[end] == nums[--end] && start < end);
                }
            }
            while(nums[index] == nums[++index] && index < nums.length - 2);
        }
        return resultList;
    }

    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(a);
        for (List<Integer> temp : result) {
            System.out.println(temp);
        }
    }
}
