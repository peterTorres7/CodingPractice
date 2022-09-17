package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**

    You are given a 0-indexed integer array nums. In one operation, you may do the following:

        Choose two integers in nums that are equal.
        Remove both integers from nums, forming a pair.

    The operation is done on nums as many times as possible.

    Return a 0-indexed integer array answer of size 2 
    where answer[0] is the number of pairs that are formed 
    and answer[1] is the number of leftover integers in nums after doing the operation 
    as many times as possible.
    

    Example 1:

    Input: nums = [1,3,2,1,3,2,2]
    Output: [3,1]

 */

public class MaximumNumberOfPairsInArray {
    
    // Time: O(n)
    // maximum number of pairs in array
    public static int[] maximumNumberOfPairsInArray (int[] nums) {
        // init ans to new int of size 2
        int[] ans = new int[2];

        // init map of integer, integer
        Map<Integer, Integer> map = new HashMap<>();
        // init pairs to 0
        int pairs = 0;
        // init leftOvers to 0
        int leftOvers = 0;

        // for each num in nums
        for (int num : nums) {
            // in map put num, map get or default num, 0 plus 1
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // for each val in map values
        for (int val : map.values()) {
            // increase pairs by val divided by 2
            pairs += val / 2;
            // increase leftOvers by val module 2
            leftOvers += val % 2;
        }

        // set ans at 0 to pairs
        ans[0] = pairs;
        // set ans at 1 to leftOvers
        ans[1] = leftOvers;
        
        // return ans
        return ans;
    }


    // main
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,3,2,2};
        System.out.println(Arrays.toString(maximumNumberOfPairsInArray(nums)));
    }
}
