# Given a fixed-length integer array arr, duplicate each occurrence of zero, 
# shifting the remaining elements to the right.

# Note that elements beyond the length of the original array are not written. 
# Do the above modifications to the input array in place and do not return anything.
 

# Example 1:

# Input: arr = [1,0,2,3,0,4,5,0]
# Output: [1,0,0,2,3,0,0,4]


def duplicateZeros(arr: list[int]) -> None:
    # init length
    length = len(arr)
    # init zeroes
    zeroes = arr.count(0)

    # init read to length - 1
    read = length - 1
    # init write to length + zeroes - 1
    write = length + zeroes - 1

    # while read has arr to read
    while read >= 0: 
        # if write is < length
        if write < length:
            # write at read
            arr[write] = arr[read]
            # if read is 0
            if arr[read] == 0:
                # decrease write by 1
                write -= 1
                # if write is < length
                if write < length:
                    # write 0
                    arr[write] = 0
        
        # decrease read and write by 1
        read -= 1
        write -= 1 

print(duplicateZeros(arr = [1,0,2,3,0,4,5,0]))

# pattern two pointers
# time: O(n)
# space: O(1)