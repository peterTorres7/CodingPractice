package leetcode;

import java.util.Arrays;

/**
    Given the array nums, for each nums[i] find out how many numbers in the array 
    are smaller than it. That is, for each nums[i] you have to count the number of valid j's 
    such that j != i and nums[j] < nums[i].

    Return the answer in an array.

    Example 1:

    Input: nums = [8,1,2,2,3]
    Output: [4,0,1,1,3]
 */

public class SmallerNumbersThanCurrent {

    // Time: O()
    // smaller numbers than current using brute force
    public static int[] smallerNumbersThanCurrent (int[] nums) {
        // initialize ansArray to nums length
        int[] ansArray = new int[nums.length];
        // for each num in nums
        for (int i = 0; i < nums.length; i++) {
            // initialize smaller count to 0
            int smallerCount = 0;
            // for each num in nums
            for (int j = 0; j < nums.length; j++) {
                // if nums at j index is less than nums at i index
                if (nums[j] < nums[i]) {
                    // increase smaller count by 1
                    smallerCount++;
                }
            }
            // after inner loop set ansArray at i index to smaller count
            ansArray[i] = smallerCount;
        } 
        
        //return ansArray
        return ansArray;
    }

    // main method
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
