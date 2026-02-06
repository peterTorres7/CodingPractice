# Given an integer array nums sorted in non-decreasing order, 
# remove some duplicates in-place such that each unique element appears at most twice. 
# The relative order of the elements should be kept the same.

# Since it is impossible to change the length of the array in some languages, 
# you must instead have the result be placed in the first part of the array nums. More formally, 
# if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. 
# It does not matter what you leave beyond the first k elements.

# Return k after placing the final result in the first k slots of nums.

# Do not allocate extra space for another array. 
# You must do this by modifying the input array in-place with O(1) extra memory.

# Example 1:

# Input: nums = [1,1,1,2,2,3]
# Output: 5, nums = [1,1,2,2,3,_]

def removeDuplicatesII(nums: List[int]) -> int:
    # init counter
    counter = 0
    # init write
    write = 0

    # for read in range of length of nums
    for read in range(len(nums)):
        # if read is 0 or nums at read is not equal to nums at read minus 1
        if read == 0 or nums[read] != nums[read - 1]:
            # set counter to 1
            counter = 1
            # set nums at write to nums at read
            nums[write] = nums[read]
            # increase write by 1
            write += 1

        # if counter is less than 2 and nums at read is equal to nums at read minus 1
        if counter < 2 and nums[read] == nums[read - 1]:
            # increase counter by 1
            counter +=1
            # set nums at write to nums at read
            nums[write] = nums[read]
            # increase write by 1
            write += 1
    
    # return write
    return write

    print(removeDuplicatesII([1,1,1,2,2,3]))

    # time: O(n)