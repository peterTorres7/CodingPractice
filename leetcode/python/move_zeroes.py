# Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

# Note that you must do this in-place without making a copy of the array.


# Example 1:

# Input: nums = [0,1,0,3,12]
# Output: [1,3,12,0,0]

def moveZeroes(nums: list[int]) -> None:
    # init write
    write = 0

    # for read in range of length of nums
    for read in range(len(nums)):
        # if nums at read is not 0
        if nums[read] != 0:
            # sets nums at write to nums at read
            nums[write] = nums[read]
            # increase write by 1
            write += 1
    
    # for i in range from write to length of nums
    for i in range(write, len(nums)):
        # set nums at i to 0
        nums[i] = 0

print(moveZeroes([0,1,0,3,12]))

# time: O(n)
# space: O(1)
# pattern: two pointers