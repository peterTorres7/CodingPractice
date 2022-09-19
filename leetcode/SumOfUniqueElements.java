package leetcode;

import java.util.HashMap;
import java.util.Map;

/**

    You are given an integer array nums. 
    The unique elements of an array are the elements that appear exactly once in the array.

    Return the sum of all the unique elements of nums.


    Example 1:

    Input: nums = [1,2,3,2]
    Output: 4

 */

public class SumOfUniqueElements {
    
    // Time: O(n)
    // sum of unique elements using map
    public static int sumOfUniqueElementsMap (int[] nums) {
        // init sum to 0
        int sum = 0;
        // init map of integer, integer
        Map<Integer, Integer> map = new HashMap<>();

        // for each num in nums
        for (int num : nums) {
            // in map put num, map get or default num, 0 plus 1
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // for each num in nums
        for (int num : nums) {
            // if map get num equals 1
            if (map.get(num) == 1) {
                // to sum add num
                sum += num;
            }
        }

        // return sum
        return sum;
    }


    // main
    public static void main(String[] args) {
        int [] nums = {1,2,3,2};
        System.out.println(sumOfUniqueElementsMap(nums));
    }
}
