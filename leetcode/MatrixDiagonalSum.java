package leetcode;

/**

    Given a square matrix mat, return the sum of the matrix diagonals.

    Only include the sum of all the elements on the primary diagonal 
    and all the elements on the secondary diagonal that are not part of the primary diagonal.
    

    Example 1:

    Input: mat = [[1,2,3],
                [4,5,6],
                [7,8,9]]
    Output: 25
    Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
    Notice that element mat[1][1] = 5 is counted only once.

 */

public class MatrixDiagonalSum {
    
    // Time: O(n)
    // matrix diagonal sum using two pointers
    public static int matrixDiagonalSum (int[][] mat) {
        // init ans to 0
        int ans = 0;

        // init left to 0
        int left = 0;
        // init right to mat length minus 1
        int right = mat.length - 1;

        // for each row in mat
        for (int[] row : mat) {
            // to ans add row at left plus row at right
            ans += row[left] + row[right];
            // increase left by 1
            left++;
            // decrease rigth by 1
            right--;
        }

        // if mat length is odd
        if (mat.length % 2 != 0) {
            // set ans to ans minus middle
            ans -= mat[mat.length / 2][mat.length / 2];
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrixDiagonalSum(mat));
    }
}
