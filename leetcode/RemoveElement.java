package leetcode;

import java.util.Arrays;

/**
 * This class removes an element from a given array in place."
 */

public class RemoveElement {

    // Time: O(n)
    // Space: O(1)
    // removes element from given array in place using two pointers
    public static int removeElement(int[] nums, int val) {
        // initialize startIndex to 0
        int startIndex = 0;
        // initialize endIndex to 0
        int endIndex = 0;
        // while startIndex is less than nums length
        while (startIndex < nums.length) {
            // if nums at startIndex is equal to val
            if (nums[startIndex] == val) {
                // increase startIndex by 1
                startIndex++;
            } else {
                // else set nums at endIndex equal to nums at startIndex
                nums[endIndex] = nums[startIndex];
                // increase startIndex by 1
                startIndex++;
                // increase endIndex by 1
                endIndex++;
            }
        }
        // after loop return endIndex
        System.out.println(Arrays.toString(nums));
        return endIndex;
    }

    // main method
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }

}
