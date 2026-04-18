# Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

# After doing so, return the array.

 

# Example 1:

# Input: arr = [17,18,5,4,6,1]
# Output: [18,6,6,6,1,-1]

def replaceElements(arr: list[int]) -> list[int]:
    # init curr max
    currMax = -1

    # for each index in arr from last to first
    for i in range(len(arr) - 1, -1, -1):
        # store curr
        curr = arr[i]
        # set arr at index to curr max
        arr[i] = currMax
        # set curr max to max of curr max and curr
        currMax = max(currMax, curr)
    
    # return arr
    return arr

arr = [17,18,5,4,6,1]
print(replaceElements(arr))
# time: O(m)
# space: O(1)
# pattern: state with backwards traversal 