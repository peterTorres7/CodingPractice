# You have a long flowerbed in which some of the plots are planted, and some are not. 
# However, flowers cannot be planted in adjacent plots.

# Given an integer array flowerbed containing 0's and 1's, 
# where 0 means empty and 1 means not empty, and an integer n, 
# return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule 
# and false otherwise.
 

# Example 1:

# Input: flowerbed = [1,0,0,0,1], n = 1
# Output: true

def canPlaceFlowers(flowerbed: list[int], n: int) -> bool:
    # if no flowers to plant return true
    if n == 0:
        return True 

    # for each position in flowerbed
    for position in range(len(flowerbed)):
        # if flowerbed at position is 0 and (position is 0 or flowerbed at position minus 1 is 0)
        # and (position is at end of flowerbed or flowerbed at position plus 1 is 0)
        if flowerbed[position] == 0 and (position == 0 or flowerbed[position - 1] == 0) and (position == len(flowerbed) - 1 or flowerbed[position + 1] == 0):
            # set flowerbed at position to 1
            flowerbed[position] = 1
            # decrease n by 1
            n -= 1
            # if n is 0
            if n == 0:
                # return true since you ran out of flowers
                return True
        
    # return false since there are flowers left
    return False

print(canPlaceFlowers([1,0,0,0,1], 1))

# space: O(1)
# time: O(n)
# greedy