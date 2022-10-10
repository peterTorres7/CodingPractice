package leetcode;

/**

    Given an integer array nums, 
    return the greatest common divisor of the smallest number and largest number in nums.

    The greatest common divisor of two numbers 
    is the largest positive integer that evenly divides both numbers.
    

    Example 1:

    Input: nums = [2,5,6,9,10]
    Output: 2

 */

public class FindGreatestCommonDivisorOfArray {
    
    // Time: O(n)
    // find greatest common divisor of array using brute force
    public static int findGreatestCommonDivisorOfArrayBruteForce (int[] nums) {
        // init min to integer max value
        int min = Integer.MAX_VALUE;
        // init max to integer min value
        int max = Integer.MIN_VALUE;

        // for each num in nums
        for (int num : nums) {
           // if num is less than min
            if (num < min) {
                // set min to num
                min = num;
            }
            // if num is greater than max
            if (num > max) {
                // set max to num
                max = num;
            }
        }

        // init divisor to min
        int divisor = min;
        // while min modulo divisor is not equal to 0 OR max modulo divisor is not equal to 0
        while (min % divisor != 0 || max % divisor != 0) {
            // decrease divisor by 1
            divisor--;
        }

        // return divisor
        return divisor;
    }


    // Time: O(n)
    // find greatest common divisor of array using Euclid's algorithim
    public static int findGreatestCommonDivisorOfArrayEuclid (int[] nums) {
        // init min to Integer max value
        int min = Integer.MAX_VALUE;
        // init max to integer min value
        int max = Integer.MIN_VALUE;

        // for each num in nums
        for (int num : nums) {
            // if num is less min
            if (num < min) {
                // set min to num
                min = num;
            }
            // if num is greater than max
            if (num > max) {
                // set max to num
                max = num;
            }
        }

        // return helper of max, min
        return helper(max, min);
    }

    // helper method
    public static int helper (int max, int min) {
        // if min equal 0
        if (min == 0) {
            // return max
            return max;
        } else {
            // else return gdc with min, max modulo min
            return helper(min, max % min);
        }
    }



    // main
    public static void main(String[] args) {
        int[] nums = {2,5,6,9,10};
        System.out.println(findGreatestCommonDivisorOfArrayEuclid(nums));
    }
}
