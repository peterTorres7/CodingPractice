package leetcode;

/**

    Given an integer array nums and an integer k, 
    return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
    

    Example 1:

    Input: nums = [1,2,2,1], k = 1
    Output: 4

 */

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    
    // Time: O(n^2)
    // count number of pairs with absolute difference k using brute force
    public static int countNumberOfPairsWithAbsoluteDifferenceKBruteForce (int[] nums, int k) {
        // init ans to 0
        int ans = 0;

        // for each num i in nums length
        for (int i = 0; i < nums.length; i++) {
            // for each num j equal i + 1 in nums length
            for (int j = i + 1; j < nums.length; j++) {
                // if math absolute of nums at i minus nums at j equal diff
                if (Math.abs(nums[i] - nums[j]) == k) {
                    // increase ans by 1
                    ans++;
                }
            }
        }

        // return ans
        return ans;
    }

    // Time: O()
    // count number of pairs with absolute difference k using array
    public static int countNumberOfPairsWithAbsoluteDifferenceKArray (int[] nums, int k) {
        // init ans to 0
        int ans = 0;
        // init frequencyArray to new int of size 101 plus 
        int[] frequencyArray = new int[101 + k];

        // for each num in nums
        for (int num : nums) {
            // increase frequencyArray at num by 1
            frequencyArray[num]++;
        }

        // for each num in nums
        for (int num : nums) {
            // to ans add frequencyArray at num plus k
            ans += frequencyArray[num + k];
        }

        // return ans
        return ans;
    }

    // main method
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
        System.out.println(countNumberOfPairsWithAbsoluteDifferenceKArray(nums, k));
    }
}
