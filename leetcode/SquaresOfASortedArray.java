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
    // squares of a sorted array
    public static int[] squaresOfASortedArray (int[] nums) {
        // init numsLength
        int numsLength = nums.length;
        // init ans to new int array of numLenght
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



    // main
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(squaresOfASortedArray(nums)));
    }
    
}
