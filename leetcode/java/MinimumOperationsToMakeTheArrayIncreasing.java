package leetcode;

/**

    You are given an integer array nums (0-indexed). 
    In one operation, you can choose an element of the array and increment it by 1.

        For example, if nums = [1,2,3], you can choose to increment nums[1] to make nums = [1,3,3].

    Return the minimum number of operations needed to make nums strictly increasing.

    An array nums is strictly increasing if nums[i] < nums[i+1] for all 0 <= i < nums.length - 1. 
    An array of length 1 is trivially strictly increasing.
    

    Example 1:

    Input: nums = [1,1,1]
    Output: 3
    Explanation: You can do the following operations:
    1) Increment nums[2], so nums becomes [1,1,2].
    2) Increment nums[1], so nums becomes [1,2,2].
    3) Increment nums[2], so nums becomes [1,2,3].

 */

public class MinimumOperationsToMakeTheArrayIncreasing {
    
    // Time: O(n)
    // minimum operations to make the array increasing
    public static int minimumOperationsToMakeTheArrayIncreasing (int[] nums) {
        // init ans to 0
        int ans = 0;

        // for each num i in nums length minus 1
        for (int i = 0; i < nums.length - 1; i++) {
            // if nums at i plus 1 is less than or equal to nums at i
            if (nums[i + 1] <= nums[i]) {
                // to ans add nums at i minus nums at i plus 1 increased by 1
                ans += nums[i] - nums[i + 1] + 1;
                // set nums at i plus 1 to nums at i increased by 1
                nums[i + 1] = nums[i] + 1;
            }
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(minimumOperationsToMakeTheArrayIncreasing(nums));       
    }
}
