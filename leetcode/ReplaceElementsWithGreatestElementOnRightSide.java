package leetcode;

import java.util.Arrays;

/**

    Given an array arr, replace every element in that array 
    with the greatest element among the elements to its right, and replace the last element with -1.

    After doing so, return the array.


    Example 1:

    Input: arr = [17,18,5,4,6,1]
    Output: [18,6,6,6,1,-1]

 */

public class ReplaceElementsWithGreatestElementOnRightSide {

    // Time: O(n+m)
    // replace elements with greatest element on right side using brute force
    public static int[] replaceElementsWithGreatestElementOnRightSide (int[] arr) {
        // for each arr i in arr length minus 1
        for (int i = 0; i < arr.length - 1; i++) {
            // init max to arr at i plus 1
            int max = arr[i + 1];
            // for each arr j plus 1 in arr length
            for (int j = i + 1; j < arr.length; j++) {
                // if arr at j is great than max
                if (arr[j] > max) {
                    // set max to arr at j
                    max= arr[j];
                }
            }
            // after inner for loop set arr at i at max
            arr[i] = max;
        }

        // set arr at arr length minus 1 to -1
        arr[arr.length -1] = -1;
        
        // return arr
        return arr;
    }


    // Time: O(n)
    // replace elements with greatest element on right side starting at the end
    public static int[] replaceElementsWithGreatestElementOnRightSideBackwards (int[] arr) {
        // init max to 0
        int max = 0;

        // for each i in arr starting at end
        for (int i = arr.length - 1; i >= 0; i--) {
            // init currentNum to arr at i
            int currentNum = arr[i];
            // set arr at i to max
            arr[i] = max;
            // set max to max of max, currentNum
            max = Math.max(max, currentNum);  
        }
        
        // set arr at arr length minus 1 to -1
        arr[arr.length - 1] = -1;

        // return arr
        return arr;
    }



    // main
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElementsWithGreatestElementOnRightSideBackwards(arr)));
    }
}
