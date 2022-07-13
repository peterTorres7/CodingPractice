package leetcode;

import java.util.Arrays;

/**
 * This class builds an array from a given permutation."
 */

public class BuildArrayFromPermutation {
    
    // Time: O(n)
    // Space: O(1)
    // Builds an array permutation from given array
    public static int[] buildArrayFromPermutation (int[] nums) {
        
        // initialize int array ans to nums length
        int[] ans = new int[nums.length];
        // loop through nums
        for (int i = 0; i < nums.length; i++) {
            // set ans at current index to nums at nums at current index
            ans[i] = nums[nums[i]];
        }
        // after loop return ans array
        return ans;
    }

    // main method
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArrayFromPermutation(nums)));
    }
}
