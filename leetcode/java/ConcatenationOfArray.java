package leetcode;

import java.util.Arrays;

/**
 * This class builds an array ans that is the concatenation of two nums arrays."
 */

public class ConcatenationOfArray {
    
    // Time: O(n)
    // Space: O(1)
    // contatenates twm nums arrays using one pointer
    public static int[] concatenationOfArray(int[] nums) {
        // create int array ans to new int array of nums length times 2
        int[] ans = new int[nums.length * 2];
        // create int numsPointer to 0
        int numsPointer = 0;
        // while numsPointer is less than nums length
        while (numsPointer < nums.length) {
            // set ans at numsPointer to nums at numsPointer
            ans[numsPointer] = nums[numsPointer];
            // set ans at nums length plus numsPointer to nums at numsPointer
            ans[numsPointer + nums.length] = nums[numsPointer];
            // increase numsPointer
            numsPointer++;
        }
        // after loop return ans
        return ans;
    }

    // main method
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(concatenationOfArray(nums)));
    }
}
