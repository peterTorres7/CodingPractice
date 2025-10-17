package leetcode;

import java.util.Arrays;

/**
    We are given a list nums of integers representing a list compressed with run-length encoding.

    Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  
    For each such pair, there are freq elements with value val concatenated in a sublist. 
    Concatenate all the sublists from left to right to generate the decompressed list.

    Return the decompressed list. 

    Example 1:

    Input: nums = [1,2,3,4]
    Output: [2,4,4,4]
 */

public class DecompressRLElist {
    
    // Time: O(n*m)
    // decomress RLE list using two pointers
    public static int[] decompressRLElist (int[] nums) {
        // initialize sum to 0
        int sum = 0;
        // for each num in nums increamenting by 2
        for (int i = 0; i < nums.length; i+=2) {
            // to sum add nums at current index
            sum += nums[i];
        }

        // initialize decompressArray to sum size
        int[] decompressArray = new int[sum];
        // initialize numsIndex to 0
        int numsIndex = 0;
        // initialize decompressArrayIndex to 0
        int decompressArrayIndex = 0;

        // while numsIndex is less than nums length
        while (numsIndex < nums.length) {
            // initialize repeatCount to nums at numsIndex
            int repeatCount = nums[numsIndex];
            // for 0 to repeatCount
            for (int i = 0; i < repeatCount; i++) {
               // set decompressArray at decompressArrayIndex to nums at numsIndex plus 1
               decompressArray[decompressArrayIndex] = nums[numsIndex + 1]; 
               // increase decompressArrayIndex by 1
               decompressArrayIndex++;
            }
            // after for loop increase numsIndex by 2
            numsIndex+=2;
        }
        
        // return decompressArray
        return decompressArray;
    }

    // main method
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }
}
