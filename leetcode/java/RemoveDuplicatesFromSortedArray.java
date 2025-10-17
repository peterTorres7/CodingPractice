package leetcode;

import java.util.Arrays;

/**
 * This class removes duplicates from a given sorted array in place."
 */

public class RemoveDuplicatesFromSortedArray {

    // Time: O(n)
    // Space: O(1)
    // Removes duplicates from sorted array in place using two pointers
    public static int removeDuplicatesFromSortedArray(int[] nums) {
        // initialize int start index
        int startIndex = 0;
        // initialize int end index
        int endIndex = 1;
        // loop through nums
        while (endIndex < nums.length) {
            // if nums at start index is equal to nums at end index
            if (nums[startIndex] == nums[endIndex]) {
                // increase end index by 1
                endIndex++;
            } else {
                // else increase start index by 1
                startIndex++;
                // set nums at start index equal to nums at end index
                nums[startIndex] = nums[endIndex];
            }
        }
        // print array
        System.out.println(Arrays.toString(nums));
        // after loop return start index plus 1
        return startIndex + 1;
    }

    // main method
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicatesFromSortedArray(nums));
    }
}
