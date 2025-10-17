package leetcode;

import java.util.Arrays;

/**
 * Implements selection sort
 */

public class SelectionSort {
    
    // Time: O(n^2)
    // selection sort
    public static int[] selectionSort (int[] nums) {
        // init numsLength
        int numsLength = nums.length;

        // for each num i in numsLength mimus 1
        for (int i = 0; i < numsLength - 1; i++) {
            // init minIndex to i
            int minIndex = i;
            // for each j set to i plus 1 in numsLength
            for (int j = i + 1; j < numsLength; j++) {
                // if nums at j is less than nums at minIndex
                if (nums[j] < nums[minIndex]) {
                    // set minIndex to j
                    minIndex = j;
                }
            }
            // after inner loop init temp to nums at i
            int temp = nums[i];
            // set nums at i to nums at minIndex
            nums[i] = nums[minIndex];
            // set nums at minIndex to temp
            nums[minIndex] = temp;
        }

        // return nums
        return nums;
    }



    // main
    public static void main(String[] args) {
        int[] nums = {64,25,12,22,11};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }
}
