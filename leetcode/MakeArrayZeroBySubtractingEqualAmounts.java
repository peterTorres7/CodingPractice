package leetcode;

import java.util.HashSet;
import java.util.Set;

/**

    You are given a non-negative integer array nums. In one operation, you must:

        Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
        Subtract x from every positive element in nums.

    Return the minimum number of operations to make every element in nums equal to 0.

    
    Example 1:

    Input: nums = [1,5,0,3,5]
    Output: 3

 */

public class MakeArrayZeroBySubtractingEqualAmounts {
    
    // Time: O(n)
    // make array zero by subtracting equal amounts using set
    public static int makeArrayZeroBySubtractingEqualAmounts (int[] nums) {
        // init set of integer
        Set<Integer> set = new HashSet<>();
        
        // for each num in nums
        for (int num : nums) {
            // if num is not equal to 0
            if (num != 0) {
                // to set add num
                set.add(num);
            }
        }

        // return set size
        return set.size();
    }



    // main
    public static void main(String[] args) {
        int[] nums = {1,5,0,3,5};
        System.out.println(makeArrayZeroBySubtractingEqualAmounts(nums));
    }
}
