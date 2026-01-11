# Given an input string s, reverse the order of the words.

# A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

# Return a string of the words in reverse order concatenated by a single space.

# Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

# Example 1:

# Input: s = "the sky is blue"
# Output: "blue is sky the"

def reverseWords(s: str) -> str:
    # split s
    s = s.split()
    # init left and right pointers
    left = 0
    right = len(s) - 1

    # while left is less than right
    while left < right:
        # swap words
        s[left], s[right] = s[right], s[left]
        # increase left by 1 and decrease right by 1
        left += 1
        right -= 1
    
    # return string of list with single spaces
    return ' '.join(s)

print(reverseWords('the sky is blue'))

# space: O(n)
# time: O(n)
# pattern: two pointers