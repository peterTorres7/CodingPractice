package leetcode;

/**

    Given an array nums of integers, return how many of them contain an even number of digits.

    

    Example 1:

    Input: nums = [12,345,2,6,7896]
    Output: 2

 */

public class FindNumbersWithEvenNumberOfDigits {
    
    // Time: O(nm)
    // find numbers with even number of digits
    public static int findNumbersWithEvenNumberOfDigits (int[] nums) {
        // init ans to 0
        int ans = 0;

        // for each num in nums
        for (int num : nums) {
            // init length to 0
            int length = 0;
            // while num is greater than 0
            while (num > 0) {
                // set nun to divided by 10
                num /= 10;
                // increase length by 1
                length++;
            }
            // after while loop if length is even 
            if (length % 2 == 0) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbersWithEvenNumberOfDigits(nums));
    }
}
