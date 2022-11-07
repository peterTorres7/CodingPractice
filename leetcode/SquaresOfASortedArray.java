package leetcode;

import java.util.Arrays;

/**

    Given an integer array nums sorted in non-decreasing order, 
    return an array of the squares of each number sorted in non-decreasing order.

    

    Example 1:

    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].

 */

public class SquaresOfASortedArray {
    
    // Time: O(nlogn)
    // squares of a sorted array using sort
    public static int[] squaresOfASortedArraySort (int[] nums) {
        // init numsLength
        int numsLength = nums.length;
        // init ans to new int array of numLength
        int[] ans = new int[numsLength];

        // for each i in nums
        for (int i = 0; i < numsLength; i++) {
            // set ans at i to nums at i times nums at i
            ans[i] = nums[i] * nums[i];
        }

        // sort ans
        Arrays.sort(ans);

        // return ans
        return ans;
    }


    // Time: O(n)
    // squares of a sorted arrays using two pointers
    public static int[] squaresOfASortedArrayTwoPointers (int[] nums) {
        // init numsLength
        int numsLength = nums.length;
        // init ans to new int array of numsLength
        int[] ans = new int[numsLength];
        // init left to 0
        int left = 0;
        // init right to numsLength minus 1
        int right = numsLength - 1;

        // for each i to 0
        for (int i = numsLength - 1; i >= 0; i--) {
            // init leftSquared to nums at left times nums at left
            int leftSquared = nums[left] * nums[left];
            // init rightSquared to nums at right times nums at right
            int rightSquared = nums[right] * nums[right];
            // if leftSquared is greater than rightSquared
            if (leftSquared > rightSquared) {
                // set ans at i to leftSquared
                ans[i] = leftSquared;
                // increase left by 1
                left++;
            } else {
                // else set ans at i to rightSquared
                ans[i] = rightSquared;
                // decrease right by 1
                right--;
            }
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(squaresOfASortedArrayTwoPointers(nums)));
    }
    
}
