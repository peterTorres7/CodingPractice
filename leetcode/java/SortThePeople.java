package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**

    You are given an array of strings names, 
    and an array heights that consists of distinct positive integers. Both arrays are of length n.

    For each index i, names[i] and heights[i] denote the name and height of the ith person.

    Return names sorted in descending order by the people's heights.


    Example 1:

    Input: names = ["Mary","John","Emma"], heights = [180,165,170]
    Output: ["Mary","Emma","John"]
    Explanation: Mary is the tallest, followed by Emma and John.

 */

public class SortThePeople {
    
    // Time: O(n)
    // sort the people using map
    public static String[] sortThePeople (String[] names, int[] heights) {
        // init map of integer, string
        Map<Integer, String> map = new TreeMap<>();
        
        // for each height i in heights length
        for (int i = 0; i < heights.length; i++) {
            // in map put heights at i names at i
            map.put(heights[i], names[i]);
        }

        // init ans to map size
        String[] ans = new String[map.size()];

        // init index to ans length minus 1
        int index = ans.length - 1;
        // for each key in map key set
        for (int key : map.keySet()) {
            // set ans at index to map get key
            ans[index] = map.get(key);
            // decrease index by 1
            index--;
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"}; 
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortThePeople(names, heights)));
    }
}
