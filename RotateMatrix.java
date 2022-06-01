/**
 * This class rotates NxN matrix by 90 degrees.
 */

public class RotateMatrix {                       

    // Time: O(n^2)
    // rotates matrix clockwise in place by 90 degrees 
    public static boolean rotateMatrix(int[][] matrix) {
        // if matrix length is equal to 0 OR matrix length not equal to matrix first length return false
        if (matrix.length == 0 || matrix.length != matrix[0].length);

        // initialize matrixLength to matrix lenth
        int matrixLength = matrix.length;
        // loop through have the matrix
        for (int layer = 0; layer < matrixLength / 2; layer++) {
            // initialize first as layer
            int first = layer;
            // initialize last to matrixLength minus 1 minus layer
            int last = matrixLength - 1 - layer;
            // loop from first to last
            for (int i = first; i < last; i++) {
                // initialize offset to i minus first
                int offset = i - first;
                // initialzie tempTop to hold first top space
                int tempTop = matrix[first][i];
                // left to top
                matrix[first][i] = matrix[last - offset][first];
                // bottom to left
                matrix[last - offset][first] = matrix[last][last - offset];
                // right to bottom
                matrix[last][last - offset] = matrix[i][last]; 
                // temp to right
                matrix[i][last] = tempTop;
            }
        }
        // return true after loops since it can rotate 90 degrees
        return true;
    }
}
