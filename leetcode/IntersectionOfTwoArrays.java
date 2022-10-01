package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**

Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must be unique and you may return the result in any order.
 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

 */

public class IntersectionOfTwoArrays {
    
    // Time: O(n)
    // intersection of two arrays using set
    public static int[] intersectionOfTwoArrays (int[] nums1, int[] nums2) {
        // init set of integer 
        Set<Integer> set = new HashSet<>();
        // init set of integer nums2set
        Set<Integer> nums2set = new HashSet<>();

        //for each num in nums2
        for (int num : nums2) {
            // to nums2set add num
            nums2set.add(num);
        }

        //for each num in nums1
        for (int num : nums1) {
            // if nums2set contains num
            if (nums2set.contains(num)) {
                // to set add num
                set.add(num);
            }
        }

        // init ans to new int array of set size
        int[] ans = new int[set.size()];
        
        // init index to 0
        int index = 0;
        // for each num in set
        for (int num : set) {
            // set ans at index to num
            ans[index] = num;
            // increase index by one
            index++;
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}; 
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersectionOfTwoArrays(nums1, nums2)));
    }
}
