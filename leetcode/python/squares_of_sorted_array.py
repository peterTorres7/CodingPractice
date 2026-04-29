# Given an integer array nums sorted in non-decreasing order, 
# return an array of the squares of each number sorted in non-decreasing order.


# Example 1:

# Input: nums = [-4,-1,0,3,10]
# Output: [0,1,9,16,100]

def sortedSquares(nums):
    # init arr of nums length
    arr = [0] * len(nums)
    # init pointers at both ends
    left = 0
    right = len(nums) - 1

    # from last to first index in arr
    for i in range(len(nums) - 1, -1, -1):
        # if absolute of left is > absolute of right
        if abs(nums[left]) > abs(nums[right]):
            # set index to left squared
            arr[i] = nums[left] * nums[left]
            # increase left by 1
            left += 1
        # else set index to right squared
        else:
            arr[i] = nums[right] * nums[right]
            # decrease right by 1
            right -= 1
    
    # return arr
    return arr


# main
nums = [-4,-1,0,3,10]
print(sortedSquares(nums))


# time: O(n)
# space: O(n)
# pattern: two pointers