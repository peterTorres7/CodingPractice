# Given an array of integers arr and two integers k and threshold, 
# return the number of sub-arrays of size k and average greater than or equal to threshold.
 

# Example 1:

# Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
# Output: 3

def numOfSubarrays(arr, k, threshold):
    # init counter, target avg, and window sum
    counter = 0
    targetAvg = threshold * k
    windowSum = 0


    # slide window and update counter
    for i in range(len(arr)):
        windowSum += arr[i]

        # if window is too big delete last num
        if i >= k:
            windowSum -= arr[i - k]

        # if window is valid and window sum is greater than target avg increase counter
        if i >= k - 1 and windowSum >= targetAvg:
            counter += 1

    # return counter
    return counter


# main
arr = [2,2,2,2,5,5,5,8] 
k = 3 
threshold = 4

print(numOfSubarrays(arr, k, threshold))

# time: O(n)
# space: O(1)
# pattern: sliding window