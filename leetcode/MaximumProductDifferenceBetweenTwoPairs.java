package leetcode;

import java.util.Arrays;

/**
 
    The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).

        For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.

    Given an integer array nums, choose four distinct indices w, x, y, and z 
    such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.

    Return the maximum such product difference.


    Example 1:

    Input: nums = [5,6,2,7,4]
    Output: 34

 */

public class MaximumProductDifferenceBetweenTwoPairs {
    
    // Time: O(nlogn)
    // maximum product difference between two pairs using sort
    public static int maximumProductDifferenceBetweenTwoPairsSort (int[] nums) {
        // sort nums
        Arrays.sort(nums);
        // return nums at nums length - 1 * nums at nums length - 2 miinus nums at 0 * nums at 1
        return ((nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]));
    }

    // main 
    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        System.out.println(maximumProductDifferenceBetweenTwoPairsSort(nums));
    }
}
