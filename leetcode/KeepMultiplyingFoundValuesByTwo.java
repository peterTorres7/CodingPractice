package leetcode;

import java.util.HashSet;
import java.util.Set;

/**

    You are given an array of integers nums. 
    You are also given an integer original which is the first number that needs to be searched for in nums.

    You then do the following steps:

        If original is found in nums, multiply it by two (i.e., set original = 2 * original).
        Otherwise, stop the process.
        Repeat this process with the new number as long as you keep finding the number.

    Return the final value of original.

    
    Example 1:

    Input: nums = [5,3,6,1,12], original = 3
    Output: 24

 */

public class KeepMultiplyingFoundValuesByTwo {
    
    // Time: O(n)
    // keep multiplying found values by two using set
    public static int keepMultiplyingFoundValuesByTwoSet (int[] nums, int original) {
        // init set of integer
        Set<Integer> set = new HashSet<>();
        
        // for each num in nums
        for (int num : nums) {
            // to set add num
            set.add(num);
        }

        // while set contains original
        while (set.contains(original)) {
            // set original to original times 2
            original *= 2;
        }

        // return original
        return original;
    }


    // Time: O(n)
    // keep multiplying found values by two using brute force
    public static int KeepMultiplyingFoundValuesByTwoBruteForce (int[] nums, int original) {
        // init numsPointer to 0
        int numsPointer = 0;
        
        // while numsPointer is less than nums length
        while (numsPointer < nums.length) {
            // if nums at numsPointer is equal to original
            if (nums[numsPointer] == original) {
                // set original to original times 2
                original *= 2;
                // set numsPointer to 0
                numsPointer = 0;
            }
            // after if increase numsPointer by 1
            numsPointer++;
        }

        // return original
        return original;
    }
 


    // main
    public static void main(String[] args) {
        int[] nums = {5,3,6,1,12};
        int original = 3;
        System.out.println(KeepMultiplyingFoundValuesByTwoBruteForce(nums, original));
    }
}
