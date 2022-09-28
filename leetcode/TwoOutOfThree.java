package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**

    Given three integer arrays nums1, nums2, and nums3, 
    return a distinct array containing all the values that are present in at least two out of the three arrays. 
    You may return the values in any order.
    

    Example 1:

    Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
    Output: [3,2]

 */

public class TwoOutOfThree {
    
    // Time: O(n)
    // two out of three using set
    public static List<Integer> twoOutOfThree (int[] nums1, int[] nums2, int[] nums3) {
        // init list of interger ansList to new arraylist
        List<Integer> ansList = new ArrayList<>();
        // init set of integer ansSet
        Set<Integer> ansSet = new HashSet<>();
        // init set of integer set1 to helper of nums1
        Set<Integer> set1 = helper(nums1);
        // init set of integer set2 to helper of nums2
        Set<Integer> set2 = helper(nums2);
        // init set of integer set3 to helper of nums3
        Set<Integer> set3 = helper(nums3);

        // for each num in set1
        for (int num : set1) {
            // if set2 contains num OR set3 contains num
            if (set2.contains(num) || set3.contains(num)) {
                // to ansSet add num
                ansSet.add(num);
            }
        }

        // for each num in set2
        for (int num : set2) {
            // if set1 contains num OR set3 contains num
            if (set1.contains(num) || set3.contains(num)) {
                // to ansSet add num
                ansSet.add(num);
            }
        }

        // for each num in set3
        for (int num : set3) {
            // if set1 contains num OR set2 contains num
            if (set1.contains(num) || set2.contains(num)) {
                // to ansSet add num
                ansSet.add(num);
            }
        }

        // for each num in ansSet
        for (int num : ansSet) {
            // to ansList add num
            ansList.add(num);
        }

        // return ansList
        return ansList;
    }

    // helper method
    public static Set<Integer> helper (int[] nums) {
        // init set of integer
        Set<Integer> set = new HashSet<>();
        
        // for each num in nums
        for (int num : nums) {
            // to set add num
            set.add(num);
        }
        
        // return set
        return set;
    }



    // main
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};
        System.out.println(twoOutOfThree(nums1, nums2, nums3));
    }
}
