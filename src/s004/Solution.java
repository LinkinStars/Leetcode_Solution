package s004;

/**
 * @author : LinkinStar
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lengthA = nums1.length;
        int lengthB = nums2.length;
        int sumLength = lengthA + lengthB;
        if (sumLength == 0) {
            return 0;
        }
        int mid = sumLength / 2;
        if (sumLength % 2 != 0) {
            mid++;
        }

        int indexA = 0;
        int indexB = 0;
        while (indexA != lengthA && indexB != lengthB) {
            if (mid == 1) {
                break;
            }
            int cur = mid / 2;
            if (indexA + cur > lengthA) {
                indexB += cur;
            } else if (indexB + cur > lengthB) {
                indexA += cur;
            } else {
                if (nums1[indexA + cur - 1] < nums2[indexB + cur - 1]) {
                    indexA += cur;
                } else {
                    indexB += cur;
                }
            }
            mid -= cur;
        }

        if (sumLength % 2 != 0) {
            if (indexA == lengthA) {
                return nums2[indexB + mid - 1];
            } else if (indexB == lengthB) {
                return nums1[indexA + mid - 1];
            } else {
                return  Math.min(nums1[indexA + mid - 1], nums2[indexB + mid - 1]);
            }
        }

        if (indexA == lengthA) {
            return (nums2[indexB + mid - 1] + nums2[indexB + mid]) * 1.0 / 2;
        }
        if (indexB == lengthB) {
            return (nums1[indexA + mid - 1] + nums1[indexA + mid]) * 1.0 / 2;
        }

        int result = 0;
        if (nums1[indexA + mid - 1] < nums2[indexB + mid - 1]) {
            result = nums1[indexA + mid - 1];
            indexA++;
        } else {
            result = nums2[indexB + mid - 1];
            indexB++;
        }

        if (indexA == lengthA) {
            result += nums2[indexB + mid - 1];
        } else if (indexB == lengthB) {
            result += nums1[indexA + mid - 1];
        } else {
            result += Math.min(nums1[indexA + mid - 1], nums2[indexB + mid - 1]);
        }
        return  result * 1.0 / 2;
    }
    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {};
        int[] nums2 = {1,2,3,4,5,6};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }
}
