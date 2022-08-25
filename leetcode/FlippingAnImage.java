package leetcode;

import java.util.Arrays;

/**

    Given an n x n binary matrix image, flip the image horizontally, 
    then invert it, and return the resulting image.

    To flip an image horizontally means that each row of the image is reversed.

        For example, flipping [1,1,0] horizontally results in [0,1,1].

    To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

        For example, inverting [0,1,1] results in [1,0,0].
    

    Example 1:

    Input: image = [[1,1,0],[1,0,1],[0,0,0]]
    Output: [[1,0,0],[0,1,0],[1,1,1]]

*/

public class FlippingAnImage {
    
    // Time: O(n*m)
    // flipping an image using brute force
    public static int[][] flippingAnImage (int[][] image) {
        // horizontal flip
        // for each column in image
        for (int[] row : image) {
            // init left to 0
            int left = 0;
            // init right to row length - 1
            int right = row.length - 1;
            // while left is less than right
            while (left < right) {
                // init temp to row at left
                int temp = row[left];
                // set row at left to row at right
                row[left] = row[right];
                // set row at right to temp
                row[right] = temp;
                // increase left by 1
                left++;
                // decrease right by 1
                right--;
            }
        }

        // invert
        // for each row in image
        for (int i = 0; i < image.length; i++) {
            // for each column in row 
            for (int j = 0; j < image[i].length; j++) {
                // if image at row column equals 0
                if (image[i][j] == 0) {
                    // set image at row column to 1
                    image[i][j] = 1;
                } else {
                    // else set image at row column to 0
                    image[i][j] = 0;
                }
            }
        }

        // return image
        return image;
    }

    // main
    public static void main (String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flippingAnImage(image)));
    }
}
