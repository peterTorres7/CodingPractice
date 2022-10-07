package leetcode;

import java.util.Arrays;

/**

    Given the array of integers nums, you will choose two different indices i and j of that array. 
    Return the maximum value of (nums[i]-1)*(nums[j]-1).

    

    Example 1:

    Input: nums = [3,4,5,2]
    Output: 12 

 */

public class MaximumProductOfTwoElementsInAnArray {
    
    // Time: O(nlogn)
    // maximum product of twor elements in an array
    public static int maximumProductOfTwoElementsInAnArray (int[] nums) {
        // sort nums
        Arrays.sort(nums);
        // return nums at nums length minus 1 minus 1 times nums at nums length minus 2 minus 1
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }



    // main
    public static void main(String[] args) {
        int [] nums = {3,4,5,2};
        System.out.println(maximumProductOfTwoElementsInAnArray(nums));
    }
}
