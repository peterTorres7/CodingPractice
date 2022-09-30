package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**

    Given an array of integers arr, 
    return true if the number of occurrences of each value in the array is unique, 
    or false otherwise.
    

    Example 1:

    Input: arr = [1,2,2,1,1,3]
    Output: true
    Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. 
    No two values have the same number of occurrences.

*/

public class UniqueNumberOfOccurrences {
    
    // Time: O(n)
    // unique number of occurrences
    public static boolean uniqueNumberOfOccurrences (int[] arr) {
        // init map of integer, integer
        Map<Integer, Integer> map = new HashMap<>();
        // init set of integer
        Set<Integer> set = new HashSet<>();

        // for each ar in arr
        for (int ar : arr) {
            // in map put ar, map get or default ar, 0 plus 1
            map.put(ar, map.getOrDefault(ar, 0) + 1);
        }

        // for each val in map values
        for (int val : map.values()) {
            // to set add val
            set.add(val);
        }

        // return if map size is equal to set size
        return map.size() == set.size();
    }



    // main
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueNumberOfOccurrences(arr));
    }
}
