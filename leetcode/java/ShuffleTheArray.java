package leetcode;

import java.util.Arrays;

/**
 * Given the array nums consisting of 2n elements in the form 
 * [x1,x2,...,xn,y1,y2,...,yn]. Return the array in the form 
 * [x1,y1,x2,y2,...,xn,yn].

 * Example 1:

 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7] 
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then 
 * the answer is [2,3,5,4,1,7].
 */

public class ShuffleTheArray {
    
    // Time: O(n)
    // shuffle the array using two pointers
    public static int[] shuffleTheArray (int[] nums, int n) {
        // initialize shuffledNums to nums length
        int[] shuffledNums = new int[nums.length];
        // initialize numsPointer to 0
        int numsPointer = 0;
        // initialize shuffledNumsPointer to 0
        int shuffledNumsPointer = 0;

        // while numsPointer plun n is less than nums length
        while (numsPointer + n < nums.length) {
            // set shuffledNums at shuffledNumspointer to nums at numsPointer
            shuffledNums[shuffledNumsPointer] = nums[numsPointer];
            // increase shuffledNumsPointer by 1
            shuffledNumsPointer++;
            // set shuffledNums at shuffledNumsPointer to nums at numsPointer plus n
            shuffledNums[shuffledNumsPointer] = nums[numsPointer + n];
            // increase shuffledNumsPointer by 1
            shuffledNumsPointer++;
            // increase numsPointer by 1
            numsPointer++;
        }

        // after loop return shuffledNums
        return shuffledNums;
    }

    // main method
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffleTheArray(nums, n)));
    }
}
