# Given an integer array nums, move all the even integers at the beginning of the array 
# followed by all the odd integers.

# Return any array that satisfies this condition.


# Example 1:

# Input: nums = [3,1,2,4]
# Output: [2,4,3,1]

def sortArrayByParity(nums: list[int]) -> list[int]:
    # init left read
    readLeft = 0
    # init right read
    readRight = len(nums) - 1

    # while read left is less than read right
    while readLeft < readRight:
        # if nums at read left is odd and nums at read right is even
        if nums[readLeft] % 2 != 0 and nums[readRight] % 2 == 0:
            # swap nums
            nums[readLeft], nums[readRight] = nums[readRight], nums[readLeft]
            # increase readLeft by 1
            readLeft += 1
            # decrease readRight by 1
            readRight -= 1
        # else if nums at read left is even
        elif nums[readLeft] % 2 == 0:
            # increase read left by 1
            readLeft += 1
        # else
        else:
            # decrease read right by 1
            readRight -= 1

    # return nums
    return nums

nums = [3,1,2,4]
print(sortArrayByParity(nums))

# time: O(n)
# space: O(1)