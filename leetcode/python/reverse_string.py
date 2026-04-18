# Write a function that reverses a string. The input string is given as an array of characters s.

# You must do this by modifying the input array in-place with O(1) extra memory.

 

# Example 1:

# Input: s = ["h","e","l","l","o"]
# Output: ["o","l","l","e","h"]

def reverseString(s: list[str]) -> None:
    # init left and right to opposite ends
    left = 0
    right = len(s) - 1

    # while left is less than right
    while left < right:
        # swap
        s[left], s[right] = s[right], s[left]

        # increase left and decrease right
        left += 1
        right -= 1

s = ["h","e","l","l","o"]        
print(reverseString(s))

# space: O(1)
# time: O(n)
# pattern: two pointer