package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
    You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. 
    A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

        i < j < k,
        nums[j] - nums[i] == diff, and
        nums[k] - nums[j] == diff.

    Return the number of unique arithmetic triplets.


    Example 1: 
                         
    Input: nums = [0,1,4,6,7,10], diff = 3
    Output: 2
    Explanation:
    (1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
    (2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3. 

 */

public class NumberOfArithmeticTriplets {
 
    // Time: O(n^3)
    // number of arithmetic triplets using  brute force
    public static int numberOfArithmeticTripletsBruteForce (int[] nums, int diff) {
        // init ans to 0
        int ans = 0;

        // for each num i in nums length
        for (int i = 0; i < nums.length; i++) {
            // for each num j i plus one in nums length
            for (int j = i + 1; j < nums.length; j++) {
                // for each num k j plus one in nums length
                for (int k = j + 1; k < nums.length; k++) {
                    // if nums at j minus nums at i equals diff AND nums at k minus nums at j equal diff
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        // increase ans by 1
                        ans++;
                    }
                }
            }
        }

        // return ans
        return ans;
    }

    // Time: O(n)
    // number of arithmetic triplets using map
    public static int numberOfArithmeticTripletsMap (int[] nums, int diff) {
        // init ans to 0
        int ans = 0;
        // init numsMap
        Map<Integer, Integer> numsMap = new HashMap<>();

        // for each num i in nums length
        for (int i = 0; i < nums.length; i++) {
            // in numsMap put i, nums at i
            numsMap.put(i, nums[i]);
        }

        // for each num i starting at 1 in nums length minus 1
        for (int i = 1; i < nums.length - 1; i++) {
            // if numsMap contains value nums at i plus diff 
            // AND numsMap contains value nums at i minus diff
            if (numsMap.containsValue(nums[i] - diff) && numsMap.containsValue(nums[i] + diff)) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans
        return ans;
    }

    // main method
    public static void main (String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        System.out.println(numberOfArithmeticTripletsMap(nums, diff));
    }
}
