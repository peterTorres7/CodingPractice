package leetcode;

import java.util.Arrays;

/**

    A school is trying to take an annual photo of all the students. 
    The students are asked to stand in a single file line in non-decreasing order by height. 
    Let this ordering be represented by the integer array expected 
    where expected[i] is the expected height of the ith student in line.

    You are given an integer array heights representing the current order that the students are standing in. 
    Each heights[i] is the height of the ith student in line (0-indexed).

    Return the number of indices where heights[i] != expected[i].
    

    Example 1:

    Input: heights = [1,1,4,2,1,3]
    Output: 3
    Explanation: 
    heights:  [1,1,4,2,1,3]
    expected: [1,1,1,2,3,4]
    Indices 2, 4, and 5 do not match.

 */

public class HeightChecker {
    
    // Time: O(nlogn)
    // height checker
    public static int heightChecker (int[] heights) {
        // init ans to 0
        int ans = 0;
        // init expected to heights length
        int[] expected = new int[heights.length];

        // for each height i in heights
        for (int i = 0; i < heights.length; i++){
            // set expected at i to heights at i
            expected[i] = heights[i];
        }

        // sort expected
        Arrays.sort(expected);

        // for each height i in heights
        for (int i = 0; i < heights.length; i++) {
            // if heights at i is not equal to expected at i
            if (heights[i] != expected[i]) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
