// Given a string s, reverse the string according to the following rules:

//     All the characters that are not English letters remain in the same position.
//     All the English letters (lowercase or uppercase) should be reversed.

// Return s after reversing it.

 

// Example 1:

// Input: s = "ab-cd"
// Output: "dc-ba"

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String s) {
        // turn s to char arr
        char[] arr = s.toCharArray();
        // init pointers at opposite ends
        int left = 0;
        int right = arr.length - 1;

        // while left and right don't cross
        while (left < right) {
            // while left and right don't cross and left is not a letter increase left by 1
            while (left< right && !Character.isLetter(arr[left])) {
                left++;
            }
            // while left and right don't cross and right is not a letter decrease right by 1
            while (left < right && !Character.isLetter(arr[right])) {
                right--;
            }

            // swawp letters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // increase left and decrease right by 1            
            left++;
            right--;
        }
        
        // return char arr as string
        return new String(arr);
    }

    // main
    public static void main(String[] args) {
        String s = "ab-cd";
        System.out.println(reverseOnlyLetters(s));
    }


    // time: O(n)
    // space: O(n)
    // pattern: two pointer
}