package leetcode;

/**

    You are given an array rectangles where rectangles[i] = [li, wi] 
    represents the ith rectangle of length li and width wi.

    You can cut the ith rectangle to form a square with a side length of k if both k <= li and k <= wi. 
    For example, if you have a rectangle [4,6], you can cut it to get a square with a side length of at most 4.

    Let maxLen be the side length of the largest square you can obtain from any of the given rectangles.

    Return the number of rectangles that can make a square with a side length of maxLen.
    

    Example 1:

    Input: rectangles = [[5,8],[3,9],[5,12],[16,5]]
    Output: 3
    Explanation: The largest squares you can get from each rectangle are of lengths [5,3,5,5].
    The largest possible square is of length 5, and you can get it out of 3 rectangles.

 */

public class NumberOfRectanglesThatCanFormTheLargestSquare {
    
    // Time: O(n)
    // number of rectangles that can form the largest square
    public static int numberOfRectanglesThatCanFormTheLargestSquare (int[][] rectangles) {
        // init ans to 0
        int ans = 0;

        // init max to 0
        int max = 0;
        // for each rectangle in rectangles
        for (int[] rectangle : rectangles) {
           // init square to math min of rectangle at 0, rectangle at 1
            int square = Math.min(rectangle[0], rectangle[1]);
           // set max to math max of max, square
           max = Math.max(max, square);
        }

        // for each rectangle in rectangles
        for (int[] rectangle : rectangles) {
            // if math min of rectangle at 0, rectangle at 1 is greater than or equal to max
            if (Math.min(rectangle[0], rectangle[1]) >= max) {
                // increase ans by 1
                ans++;
            }
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[][] rectangles = {{5,8},{3,9},{5,12},{16,5}};
        System.out.println(numberOfRectanglesThatCanFormTheLargestSquare(rectangles));
    }
}
