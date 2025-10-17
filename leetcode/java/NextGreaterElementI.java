package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**

    The next greater element of some element x in an array 
    is the first greater element that is to the right of x in the same array.

    You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

    For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] 
    and determine the next greater element of nums2[j] in nums2. 
    If there is no next greater element, then the answer for this query is -1.

    Return an array ans of length nums1.length 
    such that ans[i] is the next greater element as described above.


    Example 1:

    Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
    Output: [-1,3,-1]

 */

public class NextGreaterElementI {

    // Time: O(n)
    // next greater element I using map
    public static int[] nextGreaterElementI (int[] nums1, int[] nums2) {
        // init ans to new int of nums1 length
        int[] ans = new int[nums1.length];
        // init map of integer, integer
        Map<Integer, Integer> map = new HashMap<>();

        // for each num i in nums2 length
        for (int i = 0; i < nums2.length; i++) {
            // in map put nums2 at i, i
            map.put(nums2[i], i);
        }

        // for each num i in nums1 length
        for (int i = 0; i < nums1.length; i++) {
            // init ansNum to -1
            int ansNum = -1;
            // init index to map get nums1 at i and increase by 1
            int index = map.get(nums1[i]) + 1;

            // for each num index to nums2 length
            for (int j = index; j < nums2.length; j++) {
                // if nums2 at j is greater than nums1 at i
                if (nums2[j] > nums1[i]) {
                    // set ansNums to nums2 at j
                    ansNum = nums2[j];
                    // break
                    break;
                }
            }
            // after inner for loop set ans at i to ansNum
            ans[i] = ansNum;
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[] nums1 = {4,1,2}; 
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElementI(nums1, nums2)));
    }
}
