# Given a string s, reverse the string according to the following rules:

#     All the characters that are not English letters remain in the same position.
#     All the English letters (lowercase or uppercase) should be reversed.

# Return s after reversing it.

 
# Example 1:

# Input: s = "ab-cd"
# Output: "dc-ba"

def reverseOnlyLetters(s):
    # turn s to array
    arr = list(s)
    # init pointers at both ends
    left = 0
    right = len(arr) - 1

    # while left and right don't cross
    while left < right:
        # while left and right don't cross and left is not a letter increase left by 1
        while left < right and not arr[left].isalpha():
            left += 1
        # while left and right don't cross and right is not a letter decrease right by 1
        while left < right and not arr[right].isalpha():
            right -= 1
        
        # swap letters
        arr[left], arr[right] = arr[right], arr[left]
        # increase left and decrease right by 1
        left += 1
        right -= 1

    # return arr as string
    return "".join(arr)


# main
s = "ab-cd"
print(reverseOnlyLetters(s))


# time: O(n)
# space: O(n)
# patter: two pointer