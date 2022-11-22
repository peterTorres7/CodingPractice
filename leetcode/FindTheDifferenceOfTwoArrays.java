package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**

    Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

        answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
        answer[1] is a list of all distinct integers in nums2 which are not present in nums1.

    Note that the integers in the lists may be returned in any order.

    

    Example 1:

    Input: nums1 = [1,2,3], nums2 = [2,4,6]
    Output: [[1,3],[4,6]]

 */

public class FindTheDifferenceOfTwoArrays {
    
    // Time: O(n+m)
    // find the difference of two arrays
    public static List<List<Integer>> findTheDifferenceOfTwoArrays (int[] nums1, int[] nums2) {
        // init ans
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // init nums1set
        Set<Integer> nums1set = new HashSet<>();
        // init nums2set
        Set<Integer> nums2Set = new HashSet<>();
        // init list1
        List<Integer> list1 = new ArrayList<>();
        // init list2
        List<Integer> list2 = new ArrayList<>();

        // for each num in nums1
        for (int num : nums1) {
            // to nums1set add num
            nums1set.add(num);
        }
        
        // for each num in nums2
        for (int num : nums2) {
            // to nums2set add num
            nums2Set.add(num);
        }

        // for each num in nums1set
        for (int num : nums1set) {
            // if nums2set doesn't contain num
            if (!nums2Set.contains(num)) {
                // to list1 add num
                list1.add(num);
            }
        }

        // for each num in nums2set
        for (int num : nums2Set) {
            // if nums1set doesn't contain num
            if (!nums1set.contains(num)) {
                // to list2 add num
                list2.add(num);
            }
        }

        // to ans add list1
        ans.add(list1);
        // to ans add list2
        ans.add(list2);

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(findTheDifferenceOfTwoArrays(nums1, nums2));
    }
}
