package leetcode;

import java.util.Arrays;

/**

    Given an integer array nums, 
    move all the even integers at the beginning of the array followed by all the odd integers.

    Return any array that satisfies this condition.
    

    Example 1:

    Input: nums = [3,1,2,4]
    Output: [2,4,3,1]

 */

public class SortArrayByParity {

    // Time: O(n)
    // sort array by parity using two pointers and extra array
    public static int[] sortArrayByParityExtra (int[] nums) {
        // init ans to new int of nums length
        int[] ans = new int[nums.length];
        // init left to 0
        int left = 0;
        // init right to ans length minus 1
        int right = ans.length - 1;

        // for each num in nums
        for (int num : nums) {
            // if num is even
            if (num % 2 == 0) {
                // set ans at left to num
                ans[left] = num;
                // increase left by 1
                left++;
            } else {
                // else set ans at right to num
                ans[right] = num;
                // decrease right by 1
                right--;
            }
        }

        // return ans
        return ans;
    }


    // Time: O(n)
    // sort array by parity in place using two pointers
    public static int[] sortArrayByParityInPlace (int[] nums) {
        // init left to 0
        int left = 0;
        // init right to nums length minus 1
        int right = nums.length - 1;

        // while left is less than right
        while (left < right) {
            // if nums at left is odd AND nums at right is even
            if (nums[left] % 2 == 1 & nums[right] % 2 == 0) {
                // init temp to nums at left
                int temp = nums[left]; 
                // set nums at left to nums at right
                nums[left] = nums[right];
                // set nums at right to temp
                nums[right] = temp;
                // increase left by 1
                left++;
                // decrease right by 1
                right--;
            // else if nums at at left is even
            } else if (nums[left] % 2 == 0) {
                // increase left by one
                left++;
            } else {
                // else decrease right by 1
                right--;
            }
        }

        // return nums
        return nums;
    }



    // main
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParityInPlace(nums)));
    }
}
