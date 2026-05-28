// Given an array of integers arr and two integers k and threshold, 
// return the number of sub-arrays of size k and average greater than or equal to threshold.
 

// Example 1:

// Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
// Output: 3

public class NumberOfSubarrays {
    public static int numberOfSubarrays(int[] arr, int k, int threshold) {
        // init window sum, required sum, count
        int windowSum = 0;
        int requiredSum = threshold * k;
        int count = 0;

        // slide window
        for(int i = 0; i < arr.length; i++) {
            // add num
            windowSum += arr[i];

            // if invalid window size decrease it
            if (i >= k) {
                windowSum -= arr[i - k];
            }

            // if valid window check count
            if (i >= k - 1 && windowSum >= requiredSum) {
                count++;
            }      
        }

        // return count
        return count;
    }


    // main
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;

        System.out.println(numberOfSubarrays(arr, k, threshold));
    }

    // time: O(n)
    // space: O(1)
    // pattern: sliding window
}