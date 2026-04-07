// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

// Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

 

// Example 1:

// Input: arr = [1,0,2,3,0,4,5,0]
// Output: [1,0,0,2,3,0,0,4]

public class DuplicateZeroes {
    public static void duplicateZeroes(int[] arr) {
        // init length
        int length = arr.length;
        // init zeroes
        int zeroes = 0;

        // count zeroes
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }
        
        // init read to last index
        int read = length - 1;
        // init write to length + zeroes - 1
        int write = length + zeroes - 1;

        // while read is >= 0
        while (read >= 0) {
            // if write is < length
            if (write < length) {
                // write at read
                arr[write] = arr[read];
                // if read is 0
                if (arr[read] == 0) {
                    // decrease write
                    write--;
                    // if write is < length
                    if (write < length) {
                        // write another zero                     
                        arr[write] = 0;
                    }
                }
            }
            
            // decrease read and write by 1
            read--;
            write--;
        }
    }

    
    // pattern: two pointers
    // time: O(n)
    // space: O(1)
}