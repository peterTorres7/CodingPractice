package leetcode;

/**

    You are given a 0-indexed array of positive integers nums. 
    Find the number of triplets (i, j, k) that meet the following conditions:

        0 <= i < j < k < nums.length
        nums[i], nums[j], and nums[k] are pairwise distinct.
            In other words, nums[i] != nums[j], nums[i] != nums[k], and nums[j] != nums[k].

    Return the number of triplets that meet the conditions.


    Example 1:

    Input: nums = [4,4,2,4,3]
    Output: 3
    Explanation: The following triplets meet the conditions:
    - (0, 2, 4) because 4 != 2 != 3
    - (1, 2, 4) because 4 != 2 != 3
    - (2, 3, 4) because 2 != 4 != 3
    Since there are 3 triplets, we return 3.
    Note that (2, 0, 4) is not a valid triplet because 2 > 0.

 */

public class NumberOfUnequalTripletsInArray {
    
    // Time: O(n^3)
    // number of unequal triplets in array
    public static int numberOfUnequalTripletsInArray (int[] nums) {
        // init ans to 0
        int ans = 0;
        // init numsLength
        int numsLength = nums.length;

        // for each i in nums
        for (int i = 0; i < numsLength; i++) {
            // for each j set to i plus 1 in nums
            for (int j = i + 1; j < numsLength; j++) {
                // for each k set to j plus 1 in nums
                for (int k = j + 1; k < numsLength; k++) {
                    // if nums at i is not equal to nums at j AND nums at i is not equal to nums at k
                    // AND nums at j is not equal to nums at k
                    if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {
                        // increase ans by 1
                        ans++;
                    }
                }
            }
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[] nums = {4,4,2,4,3};
        System.out.println(numberOfUnequalTripletsInArray(nums));
    }
}
