package leetcode;

/**
    You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. 
    A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

        i < j < k,
        nums[j] - nums[i] == diff, and
        nums[k] - nums[j] == diff.

    Return the number of unique arithmetic triplets.


    Example 1:

    Input: nums = [0,1,4,6,7,10], diff = 3
    Output: 2
    Explanation:
    (1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
    (2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3. 

 */

public class NumberOfArithmeticTriplets {
 
    // Time: O()
    // number of arithmetic triplets using  brute force
    public int numberOfArithmeticTripletsBruteForce (int[] nums, int diff) {
        // init ans to 0

        // for each num i in nums length
        // for each num j i plus one in nums length
        // for each num k j plus one in nums length
        
    }
}
