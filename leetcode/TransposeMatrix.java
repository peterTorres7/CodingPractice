package leetcode;

import java.util.Arrays;

/**

    Given a 2D integer array matrix, return the transpose of matrix.

    The transpose of a matrix is the matrix flipped over its main diagonal, 
    switching the matrix's row and column indices.
    

    Example 1:

    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [[1,4,7],[2,5,8],[3,6,9]]

 */

public class TransposeMatrix {
    
    // Time: O(n^2)
    // transpose matrix
    public static int[][] transposeMatrix (int[][] matrix) {
        // init rows to matrix length
        int rows = matrix.length;
        // init cols to matrix at 0 length
        int cols = matrix[0].length;
        // init ans to new int of size cols, rows
        int[][] ans = new int[cols][rows];

        // for each i rows in matrix
        for (int i = 0; i < rows; i++) {
            // for each j cols in matrix
            for (int j = 0; j < cols; j++) {
                // set ans at j, i to matrix at i, j
                ans[j][i] = matrix[i][j];
            }
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transposeMatrix(matrix)));
    }
}
