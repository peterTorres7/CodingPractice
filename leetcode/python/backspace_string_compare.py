# Given two strings s and t, return true if they are equal when both are typed into empty text editors. 
# '#' means a backspace character.

# Note that after backspacing an empty text, the text will continue empty.


# Example 1:

# Input: s = "ab#c", t = "ad#c"
# Output: true

def backspaceCompare(s: str, t: str) -> bool:
    # init s stack
    sStack = []
    # init t stack
    tStack = []

    # for letter in s
    for letter in s:
        # if letter is equal to '#'
        if letter == '#':
            # if s stack is not empty
            if sStack:
                # s stack pop
                sStack.pop()
        # else
        else:
            # to s stack append letter
            sStack.append(letter)
    
    # for letter in t
    for letter in t:
        # if letter is equal to '#'
        if letter == '#':
            # if t stack is not empty
            if tStack:
                # to t stack pop
                tStack.pop()
        # else
        else:
            # to t stack append letter
            tStack.append(letter)
    
    # return if s stack is equal to t stack
    return sStack == tStack

print(backspaceCompare(s = "ab#c", t = "ad#c"))

# time: O(n)
# space: O(n)