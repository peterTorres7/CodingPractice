# A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

# Given a string s, return true if it is a palindrome, or false otherwise.

 

# Example 1:

# Input: s = "A man, a plan, a canal: Panama"
# Output: true

def isPalindrome(s):
    # init pointers at both ends
    left = 0
    right = len(s) - 1

    # while left is less than right
    while left < right:
        # while left < right and left is not letter or digit increase by 1
        while left < right and not s[left].isalnum():
            left += 1
        # while left < right and right is not letter or digit decrease by 1
        while left < right and not s[right].isalnum():
            right -= 1

        # if left and right are not equal return false
        if s[left].lower() != s[right].lower():
            return False
    
        # increase left and decrease right by 1
        left += 1
        right -=1

    # return true since they all match
    return True


# main
s = "A man, a plan, a canal: Panama"
print(isPalindrome(s))

# time: O(n)
# space: O(1)
# pattern: two pointers