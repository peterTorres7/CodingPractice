package leetcode;


/**

    Given a 0-indexed integer array nums of length n and an integer k, 
    return the number of pairs (i, j) where 0 <= i < j < n, 
    such that nums[i] == nums[j] and (i * j) is divisible by k.


    Example 1:

    Input: nums = [3,1,2,2,2,1,3], k = 2
    Output: 4

 */
public class CountEqualAndDivisiblePairsInAnArray {
    
    // Time: O(n^2)
    // count equal and divisible pairs in an array using brute force
    public static int countEqualAndDivisiblePairsInAnArray (int[] nums, int k) {
        // init pairs to 0
        int pairs = 0;

        // for each num i in nums
        for (int i = 0; i < nums.length; i++) {
            // for each num j in nums
            for (int j = i + 1; j < nums.length; j++) {
                // if num i equals num j AND i * j is divisible by k
                if (nums[i] == nums[j] && i * j % k == 0) {
                    // increase pairs by 1
                    pairs++;
                }
            }
        }

        // return pairs
        return pairs;
    }

    // main
    public static void main(String[] args) {
        int[] nums = {3,1,2,2,2,1,3};
        int k = 2;
        System.out.println(countEqualAndDivisiblePairsInAnArray(nums, k));
    }
}
