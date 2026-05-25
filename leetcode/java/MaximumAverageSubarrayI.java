// You are given an integer array nums consisting of n elements, and an integer k.

// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
// Any answer with a calculation error less than 10-5 will be accepted.
 

// Example 1:

// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000

public class MaximumAverageSubarrayI {
    public static double maximumAverageSubarrayI(int[] nums, int k) {
        // init max sum
        int maxSum = 0;
        // init window and update max sum
        int left = 0;
        int right = k;
        for (int i = left; i < right; i++) {
            maxSum += nums[i];
        }
        int curSum = maxSum;

        // slide window to right
        while (right < nums.length) {
            // if cur sum is higher update max sum
            curSum += nums[right];
            right++;
            curSum -= nums[left];
            left++;

            maxSum = Math.max(maxSum, curSum);
        }

        // return max saum
        return (double)maxSum / k;
    }


    // main
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3}; 
        int k = 4;

        System.out.println(maximumAverageSubarrayI(nums, k));
    }

    
    // time: O(n)
    // space: O(1)
    // pattern: sliding window    
}
