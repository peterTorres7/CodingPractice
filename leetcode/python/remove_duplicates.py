# Given an integer array nums sorted in non-decreasing order, 
# remove the duplicates in-place such that each unique element appears only once. 
# The relative order of the elements should be kept the same.

# Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, 
# return the number of unique elements k.

# The first k elements of nums should contain the unique numbers in sorted order. 
# The remaining elements beyond index k - 1 can be ignored.

# Example 1:

# Input: nums = [1,1,2]
# Output: 2, nums = [1,2,_]

def removeDuplicates(nums: list[int]) -> int:
    # if muns is empty
    if not nums:
        # return 0
        return 0
    
    # init write
    write = 0

    # for read in range of length of nums
    for read in range(len(nums)):
        # if nums at read is not equal to nums at write
        if nums[read] != nums[write]: 
            # increase write by 1
            write += 1
            # set nums at write to nums at read
            nums[write] = nums[read]
        
    # return write plus 1
    return write + 1

print(removeDuplicates([1,1,2]))

# time: O(n)
# space: O(1)
# patter: fast/slow (read/write) pointers