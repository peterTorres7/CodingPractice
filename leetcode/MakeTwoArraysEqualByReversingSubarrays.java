package leetcode;

import java.util.Arrays;

/**

    You are given two integer arrays of equal length target and arr. 
    In one step, you can select any non-empty subarray of arr and reverse it. 
    You are allowed to make any number of steps.

    Return true if you can make arr equal to target or false otherwise.

    

    Example 1:

    Input: target = [1,2,3,4], arr = [2,4,1,3]
    Output: true

 */

public class MakeTwoArraysEqualByReversingSubarrays {
    // Time: O(n logn)
    // make two arrays equal by reversing subarrays
    public static boolean makeTwoArraysEqualByReversingSubarrays (int[] target, int[] arr) {
        // sort target
        Arrays.sort(target);
        // sort arr
        Arrays.sort(arr);

        // for each num i in target length
        for (int i = 0; i < target.length; i++) {
            // if target at i is not equal to arr at i
            if (target[i] != arr[i]) {
                // return false
                return false;
            }
        }

        // return true
        return true;
    }


    



    // main
    public static void main(String[] args) {
        int[] target = {1,2,3,4}; 
        int[] arr = {2,4,1,3};
        System.out.println(makeTwoArraysEqualByReversingSubarrays(target, arr));
    }
}
