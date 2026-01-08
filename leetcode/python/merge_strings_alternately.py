# You are given two strings word1 and word2. 
# Merge the strings by adding letters in alternating order, starting with word1. 
# If a string is longer than the other, append the additional letters onto the end of the merged string.

# Return the merged string.

def mergeAlternately(word1: str, word2: str) -> str:
    # init empty merged list
    merged = []
    # init word1 pointer
    word1_pointer = 0
    # init word2 pointer
    word2_pointer = 0

    # while word1_pointer is less than word1 length or word2_pointer is less than word2 length
    while word1_pointer < len(word1) or word2_pointer < len(word2):
        # if word1_pointer is less than word1 length
        if word1_pointer < len(word1):
            # add letter to merged
            merged.append(word1[word1_pointer])
            # increase word1_pointer
            word1_pointer += 1

        # if word2_pointer is less than word2 length
        if word2_pointer < len(word2):
            # add letter to merged
            merged.append(word2[word2_pointer])
            # increase word2_pointer
            word2_pointer += 1
    
    # return string of merged list 
    return "".join(merged)

print(mergeAlternately("abc", "pqr"))

# space: O(n)
# time: O(n)
# pattern: two pointers