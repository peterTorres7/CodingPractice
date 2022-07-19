package leetcode;

/**
    Given an array of integers nums, return the number of good pairs.

    A pair (i, j) is called good if nums[i] == nums[j] and i < j.   

    Example 1:

    Input: nums = [1,2,3,1,1,3]
    Output: 4
    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */

public class NumberOfGoodPairs {
    
    // Time: O(n^2)
    // number of good pairs brute force
    public static int numberOfGoodPairsBruteForce (int[] nums) {
        // initialize goodPairs to 0
        int goodPairs = 0;
        // for each num in nums
        for (int i = 0; i < nums.length; i++) {
            // for each num plus 1 in nums
            for (int j = i + 1; j < nums.length; j++) {
                // if nums in outer loop is equal to nums in inner loop
                if (nums[i] == nums[j]) {
                    // increase goodPairs by 1
                    goodPairs++;
                }
            }
        }
        // after loops return goodPairs
        return goodPairs;
    }

    // main method
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numberOfGoodPairsBruteForce(nums));
    }
}
