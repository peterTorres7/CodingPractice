package leetcode;

import java.util.Arrays;

/**
 * This class defines a running sum of an array in place."
 */

public class RunningSumOf1dArray {

    // Time: O(n)
    // running sum of 1d array using one pointer
    public static int[] runningSumOf1dArray (int[] nums) {
        // initialize numPointer to 0
        int numsPointer = 0;
        // while numPointer is less than nums length - 1
        while (numsPointer < nums.length - 1) {
            // set nums at numPointer + 1 to nums at numPointer plus nums at numPointer  + 1
            nums[numsPointer + 1] = nums[numsPointer] + nums[numsPointer + 1];
            // increase numPointer plus 1
            numsPointer++;
        }
    
        // after loop return nums
        return nums;
    }
    
    // main method
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSumOf1dArray(nums)));
    }
}
