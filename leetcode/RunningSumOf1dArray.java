package leetcode;

import java.util.Arrays;

/**
 * This class defines a running sum of an array in place."
 */

public class RunningSumOf1dArray {

    // Time: O(n)
    // running sum of 1d array using two pointers
    public static int[] runningSumOf1dArray (int[] nums) {
        // initialzie startPointer to 0
        int startPointer = 0;
        // initialize endPointer to 1
        int endPointer = 1;
        // while endPointer is less than nums length
        while (endPointer < nums.length) {
            // set nums at endPointer to nums at startPointer plus nums at endPointer
            nums[endPointer] = nums[startPointer] + nums[endPointer];
            // increase startPointer by 1
            startPointer++;
            // increase endPointer by 1
            endPointer++;
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
