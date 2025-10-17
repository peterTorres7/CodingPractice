package leetcode;

import java.util.HashMap;
import java.util.Map;

/**

    You are given an integer array nums with the following properties:

        nums.length == 2 * n.
        nums contains n + 1 unique elements.
        Exactly one element of nums is repeated n times.

    Return the element that is repeated n times.

    

    Example 1:

    Input: nums = [1,2,3,3]
    Output: 3

 */

public class NRepeatedElementInSize2NArray {
    
    // Time: O(n)
    // N Repeated element in size 2N array using map
    public static int nRepeatedElementInSize2NArrayMap (int[] nums) {
        // init map of integer, integer map to new hashmap
        Map<Integer, Integer> map = new HashMap<>();

        // for each num in nums
        for (int num : nums) {
            // in map put num, map get or default num, 0 plus 1
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // for each num in nums
        for (int num : nums) {
            // if map get num equals nums length divided by 2
            if (map.get(num) == nums.length / 2) {
                // return num
                return num;
            }
        }

        // return -1
        return -1;
    }


    // Time: O(n)
    // N Repeated element in size 2N array using array
    public static int nRepeatedElementInSize2NArrayArray (int[] nums) {
        // init freqArray to size 10001
        int[] freqArray = new int[10001];

        // for each num in nums
        for (int num : nums) {
            // increase freqArray at num by 1
            freqArray[num]++;    
            // if freqArray at num > 1
            if (freqArray[num] > 1) {
                // return num
                return num;
            }
        }

        // return -1
        return -1;
    }


    // main
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        System.out.println(nRepeatedElementInSize2NArrayArray(nums));
    }
}
