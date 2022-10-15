package leetcode;

/**

    Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, 
    return the number of negative numbers in grid.
    

    Example 1:

    Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
    Output: 8

 */

public class CountNegativeNumbersInASortedMatrix {
    
    // Time: O(nm)
    // count negative numbers in a sorted matrix
    public static int countNegativeNumbersInASortedMatrix (int[][] grid) {
        // init ans to 0
        int ans = 0;


        // for each row in grid
        for (int[] row : grid) {
            // init right to row length minus 1
            int right = row.length - 1;
            // while right is greater than or equal to 0 AND row at right is negative
            while (right >= 0 && row[right] < 0) {
                // increase ans by 1
                ans++;
                // decrease right by 1
                right--;
            }
        }

        // return ans
        return ans;
    }


    // Time: O(n)
    // count negative numbers in a sorted matrix using single loop
    public static int countNegativeNumbersInASortedMatrixSingleLoop (int[][] grid) {
        // init ans to 0
        int ans = 0;
        // init row to 0
        int row = 0;
        // init right to grid first row length minus 1
        int right = grid[0].length - 1;

        // while row is less than grid length
        while (row < grid.length) {
            // if grid at row, right is negative
            if (grid[row][right] < 0) {
                // increase ans by 1
                ans++;
                // decrease right by 1
                right--;
            } else {
                // else decrease right by 1                
                right--;
            }
            // if right is less than 0
            if (right < 0) {
                // increase row by 1
                row++;
                // set right to grid first row length minus 1 
                right = grid[0].length - 1;                  
            }
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegativeNumbersInASortedMatrixSingleLoop(grid));
    }
}
