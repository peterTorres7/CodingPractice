# Given a string s, reverse only all the vowels in the string and return it.
# The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

# Example 1:

# Input: s = "IceCreAm"
# Output: "AceCreIm"

def reverseVowels(s: str) -> str:
    # init set of vowels
    vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}
    # init left and right pointers
    left = 0
    right = len(s) - 1
    # init list of string
    s = list(s)

    # while left is less than right
    while left < right:
        # if s at left is not in vowels
        if s[left] not in vowels:
            # increase left by 1
            left += 1
        # else if s at right is not in vowels
        elif s[right] not in vowels:
            # decrease right by 1
            right -= 1
        # else swap vowels
        else:
            s[left], s[right] = s[right], s[left]
            # increase left by 1
            left += 1
            # decrease right by 1
            right -= 1

    # return string of list
    return ''.join(s)

print(reverseVowels('IceCreAm'))

# space: O(n)
# time: O(n)
# pattern: two pointers