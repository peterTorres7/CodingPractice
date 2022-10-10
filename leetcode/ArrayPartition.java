package leetcode;

import java.util.Arrays;

/*

    Given an integer array nums of 2n integers, 
    group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) 
    such that the sum of min(ai, bi) for all i is maximized. 
    Return the maximized sum.
    

    Example 1:

    Input: nums = [1,4,3,2]
    Output: 4

 */

public class ArrayPartition {
    
    // Time: O(nlogn)
    // array partition
    public static int arrayPartition (int[] nums) {
        // init ans to 0
        int ans = 0;
        // sort nums
        Arrays.sort(nums);

        // for each num i in nums length increasing i by 2
        for (int i = 0; i < nums.length; i += 2) {
            // to ans add nums at i
            ans += nums[i];
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(arrayPartition(nums));
    }
}
