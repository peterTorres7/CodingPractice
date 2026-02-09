// Given an array of characters chars, compress it using the following algorithm:

// Begin with an empty string s. For each group of consecutive repeating characters in chars:

//     If the group's length is 1, append the character to s.
//     Otherwise, append the character followed by the group's length.

// The compressed string s should not be returned separately, but instead, 
// be stored in the input character array chars. 
// Note that group lengths that are 10 or longer will be split into multiple characters in chars.

// After you are done modifying the input array, return the new length of the array.

// You must write an algorithm that uses only constant extra space.

// Note: The characters in the array beyond the returned length do not matter and should be ignored.


// Example 1:

// Input: chars = ["a","a","b","b","c","c","c"]
// Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

public class StringCompression {
    public static int stringCompression(char[] chars) {
        // init read
        int read = 0;
        // init write
        int write = 0;

        // while read is less than chars length
        while (read < chars.length) {
            // init current char to chars at read
            char currentChar = chars[read];
            // init counter to 0
            int counter = 0;

            // while read is less than chars length and chars at read is equal to current char
            while (read < chars.length && chars[read] == currentChar) {
                // increase counter by 1
                counter++;
                // increase read by 1
                read++;         
            }

            
            // set chars at write to current char
            chars[write] = currentChar;
            // increase write by 1
            write++;

            // if counter is greater than 1
            if (counter > 1) {
                // for ch in string value of counter as char array
                for (char ch : String.valueOf(counter).toCharArray()) {
                    // set chars at write to ch
                    chars[write] = ch;
                    // increase write by one  
                    write++;                       
                }
            }
        }

        // return write
        return write;
    }

    // main
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(stringCompression(chars));
    }

    // time: O(n)
    // space: O(1)
}