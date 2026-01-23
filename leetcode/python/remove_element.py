# Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
# The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
# Consider the number of elements in nums which are not equal to val be k, to get accepted, 
# you need to do the following things:

#     Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
#     Return k.

# Example 1:

# Input: nums = [3,2,2,3], val = 3
# Output: 2, nums = [2,2,_,_]

def removeElement(nums: list[int], val: int) -> int:
    # init write
    write = 0

    # for each read in range of length of nums
    for read in range(len(nums)):
        # if nums at read is not equal to val
        if nums[read] != val:
            # set nums at write to nums at read
            nums[write] = nums[read]
            # increase write by 1
            write += 1
    
    # return write
    return write

print(removeElement([3,2,2,3], 3))

# time: O(n)
# space: O(1)
# pattern: two pointers