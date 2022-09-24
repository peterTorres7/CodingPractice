package leetcode;

import java.util.HashMap;
import java.util.Map;

/**

    You are given an integer array nums consisting of 2 * n integers.

    You need to divide nums into n pairs such that:

        Each element belongs to exactly one pair.
        The elements present in a pair are equal.

    Return true if nums can be divided into n pairs, otherwise return false.
    

    Example 1:

    Input: nums = [3,2,3,2,2,2]
    Output: true
    Explanation: 
    There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
    If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.

 */

public class DivideArrayIntoEqualPairs {
    
    // Time: O(n)
    // divided array into equal pairs using map
    public static boolean divideArrayIntoEqualPairsMap (int[] nums) {
        // init map of integer, integer
        Map<Integer, Integer> map = new HashMap<>();
        // init pairs to 0
        int pairs = 0;

        // for each num in nums
        for (int num : nums) {
            // in map put num, map get or default num, 0 plus 1
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // for each key in map key set
        for (int key : map.keySet()) {
            // if map get key modulo 2 is not equal to 0
            if (map.get(key) % 2 != 0) {
                // return false
                return false;
            }
            // to pairs add map get key divided by 2
            pairs += map.get(key) / 2;
        }

        // return if nums length divided by 2 is equal to pairs
        return nums.length / 2 == pairs;
    }


    // Time: O(n)
    // divide array into equal pairs using array
    public static boolean divideArrayIntoEqualPairsArray (int[] nums) {
        // init pairs to 0
        int pairs = 0;
        // init freqArray of size 501
        int[] freqArray = new int[501];

        // for each num in nums
        for (int num : nums) {
            // increase freqArray at num by 1
            freqArray[num]++;
        }

        // for each num in freqArray
        for (int num : freqArray) {
            // if num modulo 2 is not equal to 0
            if (num % 2 != 0) {
                // return false
                return false;
            }
            // increase pairs by freqArray at num divided by 2
            pairs += num / 2;
        }

        // return if nums length divided by 2 equals pairs
        return nums.length / 2 == pairs;
    }



    // main 
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};
        System.out.println(divideArrayIntoEqualPairsArray(nums));
    }
}
