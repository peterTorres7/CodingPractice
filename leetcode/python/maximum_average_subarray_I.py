# You are given an integer array nums consisting of n elements, and an integer k.

# Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
# Any answer with a calculation error less than 10-5 will be accepted.
 

# Example 1:

# Input: nums = [1,12,-5,-6,50,3], k = 4
# Output: 12.75000

def maximumAverageSubarrayI(nums, k):
    # init curr sum
    curr_sum = 0
    # from 0 to k add to curr sum
    for i in range(k):
        curr_sum += nums[i]

    # init max sum to curr sum
    max_sum = curr_sum

    # from index k to nums length
    for i in range(k, len(nums)):
        # to curr sum add next index and delete index minus k
        curr_sum += nums[i] - nums[i - k]
        # set max sum to max of curr sum and max sum
        max_sum = max(max_sum, curr_sum)
    
    # return max sum divided by k
    return max_sum / k


# main
nums = [1,12,-5,-6,50,3]
k = 4
print(maximumAverageSubarrayI(nums, k))


# time: O(n)
# space: O(1)
# pattern: sliding window