package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**

    Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers, 
    return the list of integers that are present in each array of nums sorted in ascending order.

    
    Example 1:

    Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
    Output: [3,4]

 */

public class IntersectionOfMultipleArrays {
    
    // Time: O(n^2)
    // intersection of multiple array
    public static List<Integer> intersectionOfMultipleArrays (int[][] nums) {
        // init list
        List<Integer> list = new ArrayList<>();
        // init map
        Map<Integer, Integer> map = new HashMap<>();
        // init numsLength
        int numsLength = nums.length;

        // for each num array in nums
        for (int[] numArray : nums) {
            // for each num in num array
            for (int num : numArray) {
                // in map put num and increase frequency by 1
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        // for each num in nums at 0
        for (int num : nums[0]) {
            // if numsLength is equal to map get num
            if (numsLength == map.get(num)) {
                // to list add num
                list.add(num);
            }
        }

        // sort list
        Collections.sort(list);
        
        // return list
        return list;
    }



    // main
    public static void main(String[] args) {
        int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println(intersectionOfMultipleArrays(nums));
    }
}
