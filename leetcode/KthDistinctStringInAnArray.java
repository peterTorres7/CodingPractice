package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**

    A distinct string is a string that is present only once in an array.

    Given an array of strings arr, and an integer k, return the kth distinct string present in arr. 
    If there are fewer than k distinct strings, return an empty string "".

    Note that the strings are considered in the order in which they appear in the array.

    

    Example 1:

    Input: arr = ["d","b","c","b","c","a"], k = 2
    Output: "a"

 */

public class KthDistinctStringInAnArray {
    
    // Time: O(n)
    // kth distinct string in an array
    public static String kthDistinctStringInAnArray (String[] arr, int k) {
        // init map of string, integer
        Map<String, Integer> map = new LinkedHashMap<>();

        // for each ar in arr
        for (String ar : arr) {
            // in map put ar, map get or default ar, 0 plus 1
            map.put(ar, map.getOrDefault(ar, 0) + 1);
        }
        
        // init distinct to 0
        int distinct = 0;
        // for each key in map key set
        for (String key : map.keySet()) {
            // if map get key equals 1
            if (map.get(key) == 1) {
                // increase dinstinct by 1
                distinct++;
                // if dinstinct equals k
                if (distinct == k) {
                    // return key
                    return key;
                }
            }
        }

        // return ""
        return "";
    }



    // main
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(kthDistinctStringInAnArray(arr, k));
    }

}
