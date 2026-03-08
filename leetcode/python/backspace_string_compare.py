# Given two strings s and t, return true if they are equal when both are typed into empty text editors. 
# '#' means a backspace character.

# Note that after backspacing an empty text, the text will continue empty.


# Example 1:

# Input: s = "ab#c", t = "ad#c"
# Output: true

# pattern: two pointers
def backspaceStringComparePythonPointers(s: str, t: str) -> bool:
    # init s pointer
    sPointer = len(s) - 1
    # init t pointer
    tPointer = len(t) - 1
    # init s skip
    sSkip = 0
    # init t skip
    tSkip = 0

    # while s pointer or t pointer have letters to read
    while sPointer >= 0 or tPointer >= 0:
        # while s pointer has letters to read
        while sPointer >= 0:
            # if s at s pointer is '#'
            if s[sPointer] == '#':
                # increase s skip by 1
                sSkip += 1
                # decrease s pointer by 1
                sPointer -= 1
            # else if there are s skips
            elif sSkip > 0:
                # decrease s skip by 1
                sSkip -= 1
                # decrease s pointer by 1
                sPointer -= 1
            # else break since letter to compare
            else:
                break
        
        # while t pointer has letters to read
        while tPointer >= 0:
            # if t at t pointer is '#'
            if t[tPointer] == '#':
                # increse t skip by 1
                tSkip += 1
                # decrease t pointer by 1
                tPointer -= 1
            # else if there are t skips
            elif tSkip > 0:
                # decrease t skip by 1
                tSkip -= 1
                # decrease t pointer by 1
                tPointer -= 1
            # else break since letter to compare
            else: 
                break

        # if s at s pointer is not equal to t at t pointer
        if sPointer >= 0 and tPointer >= 0:
            if s[sPointer] != t[tPointer]:
                # return false
                return False
        # else if only one pointer has letters to read
        elif (sPointer >= 0) != (tPointer >= 0):
            # return false
            return False
        
        # decrease s pointer by 1
        sPointer -= 1
        # decrease t pointer by 1
        tPointer -= 1
    
    # return true
    return True

print(backspaceStringComparePythonPointers(s = "ab#c", t = "ad#c"))

# time: O(n + m)
# space: O(1)



# pattern: stacks
def backspaceStringComparePythonStacks(s: str, t: str) -> bool:
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

print(backspaceStringComparePythonStacks(s = "ab#c", t = "ad#c"))

# time: O(n + m)
# space: O(n)