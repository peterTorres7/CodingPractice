package leetcode;

import java.util.Arrays;

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

    // Time: O(n logn)
    // number of good pairs using sort
    public static int numberOfGoodPairsSort (int[] nums) {
        // sort nums
        Arrays.sort(nums);

        // initialize goodPairs to 0
        int goodPairs = 0;
        // initialize frequencyCount to 1
        int frequencyCount = 1;
        // initialize numsPointer to 1
        int numsPointer = 1;
        
        // while numsPointer is less than nums length
        while (numsPointer < nums.length) {
            // if nums at numsPointer is equal to nums at numsPointer minus 1
            if (nums[numsPointer] == nums[numsPointer - 1]) {
                // increase frequencyCount by 1
                frequencyCount++;
                // increase numsPointer by 1
                numsPointer++;
            }
            // if numsPointer is equal to nums lengh OR nums at numsPointer is not equal to nums at numsPointer minus 1
            if (numsPointer == nums.length || nums[numsPointer] != nums[numsPointer - 1]) {
                // to goodPairs at ((frequencyCount) * (frequencyCount - 1)) / 2
                goodPairs += ((frequencyCount) * (frequencyCount - 1)) / 2;
                // set frequencyCount to 1
                frequencyCount = 1;
                // increase numsPointer by 
                numsPointer++;
            }            
        }

        // after loop return goodPairs
        return goodPairs;
    }

    // Time: O(n)
    // number of good pairs using array
    public static int numberOfGoodPairsArray (int[] nums) {
        // inititalzie frequencyArray to 101
        int[] frequencyArray = new int[101];
        // for each num in nums
        for (int num : nums) {
            // to numsArray at num index increase by 1
            frequencyArray[num]++;
        }

        // initialize goodPairs to 0
        int goodPairs = 0;
        // for each num in frequencyArray
        for (int num: frequencyArray) {
            // to goodPairs add (num times num - 1) / 2
            goodPairs += ((num) * (num - 1)) / 2;
        }

        // after loops return goodPairs
        return goodPairs;
    }

    // main method
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numberOfGoodPairsArray(nums));
    }
}
