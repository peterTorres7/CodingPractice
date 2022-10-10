package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**

    You are given a 0-indexed integer array nums and a target element target.

    A target index is an index i such that nums[i] == target.

    Return a list of the target indices of nums after sorting nums in non-decreasing order. 
    If there are no target indices, return an empty list. 
    The returned list must be sorted in increasing order.
    

    Example 1:

    Input: nums = [1,2,5,2,3], target = 2
    Output: [1,2]
    Explanation: After sorting, nums is [1,2,2,3,5].
    The indices where nums[i] == 2 are 1 and 2.

 */

public class FindTargetIndicesAfterSortingArray {
    
    // Time: O(nlogn)
    // find target indices after sorting array
    public static List<Integer> findTargetIndicesAfterSortingArray (int[] nums, int target) {
        // init ans to list of integer
        List<Integer> ans = new ArrayList<>();
        // sort nums
        Arrays.sort(nums);

        // for each num i in nums length
        for (int i = 0; i < nums.length; i++) {
            // if nums at i is equal to target
            if (nums[i] == target) {
                // to ans add i
                ans.add(i);
            }
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        System.out.println(findTargetIndicesAfterSortingArray(nums, target));
    }
}
