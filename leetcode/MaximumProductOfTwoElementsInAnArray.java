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
    // maximum product of twor elements in an array using sort
    public static int maximumProductOfTwoElementsInAnArraySort (int[] nums) {
        // sort nums
        Arrays.sort(nums);
        // return nums at nums length minus 1 minus 1 times nums at nums length minus 2 minus 1
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }


    // Time: O(n)
    // maximum product of twor elements in an array
    public static int maximumProductOfTwoElementsInAnArray (int[] nums) {
        // init max to integer min value
        int max = Integer.MIN_VALUE;
        // init secondMax to integer min value
        int secondMax = Integer.MIN_VALUE;

        // for each num in nums
        for (int num : nums) {
            // if num is greater than max
            if (num > max) {
                // set secondMax to max
                secondMax = max;
                // set max to num
                max = num;
            // else if num is greater than secondMax
            } else if (num > secondMax) {
                // set secondMax to num
                secondMax = num;
            }
        }

        // return max minus 1 times secondMax minus 1
        return (max - 1) * (secondMax - 1);
    }



    // main
    public static void main(String[] args) {
        int [] nums = {3,4,5,2};
        System.out.println(maximumProductOfTwoElementsInAnArray(nums));
    }
}
