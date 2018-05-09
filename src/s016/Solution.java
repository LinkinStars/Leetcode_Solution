package s016;

import java.util.Arrays;

/**
 * @author : LinkinStar
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int index = 0;
        int start = 0;
        int end = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        int minRange = Integer.MAX_VALUE;
        while (index < nums.length - 2) {
            if (nums[index] > 0 && nums[index] > target) {
                sum = nums[index] + nums[index+1] + nums[index+2];
                return Math.min(result, sum);
            }
            start = index + 1;
            end = nums.length - 1;
            while (start < end) {
                sum = nums[index] + nums[start] + nums[end];
                if (sum == target) {
                    return sum;
                }
                if (Math.abs(sum-target) < minRange) {
                    minRange = Math.abs(sum-target);
                    result = sum;
                }
                if (sum <= target) {
                    while (nums[start] == nums[++start] && start < end);
                }
                if (sum >= target) {
                    while (nums[end] == nums[--end] && start < end);
                }
            }
            while(nums[index] == nums[++index] && index < nums.length - 2);
        }
        return result;
    }

    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {6,-18,-20,-7,-15,9,18,10,1,-20,-17,-19,-3,-5,-19,10,6,-11,1,-17,-15,6,17,-18,-3,16,19,-20,-3,-17,-15,-3,12,1,-9,4,1,12,-2,14,4,-4,19,-20,6,0,-19,18,14,1,-15,-5,14,12,-4,0,-10,6,6,-6,20,-8,-6,5,0,3,10,7,-2,17,20,12,19,-13,-1,10,-1,14,0,7,-3,10,14,14,11,0,-4,-15,-8,3,2,-5,9,10,16,-4,-3,-9,-8,-14,10,6,2,-12,-7,-16,-6,10};
        int result = solution.threeSumClosest(a, -52);
        System.out.println(result);
    }
}
