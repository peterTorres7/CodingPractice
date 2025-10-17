/**
 * This class checks an MxN matrix and if an element is 0,
 * its entire row and column are set to 0.
 */

public class ZeroMatrix {                       

    // zero matrix using boolean arrays
    public static void zeroMatrixBooleanArray (int[][] matrix) {

        // initialize boolean array for row using matrix length
        boolean[] row = new boolean[matrix.length];
        // initialize boolean array for column using matrix[0] length
        boolean[] column = new boolean[matrix[0].length];
        
        // loop through rows
        for (int i = 0; i < matrix.length; i++) {
            // loop through columns
            for (int j = 0; j < matrix[0].length; j++) {
                // if matrix at [i,j] equals 0
                if (matrix[i][j] == 0) {
                    // set row at current index to true
                    row[i] = true;
                    // set column at current index to true
                    column[i] = true;
                }
            }
        }

        // loop through row length to nullify rows
        for (int i = 0; i < row.length; i++) {
            // if row at current index is true
            if (row[i]) {
                // call nullifyRow using matrix and current index as parameters
                nullifyRow(matrix, i);
            }
        }
        // loop through column length to nullify columns
        for (int j = 0; j < column.length; j++) {
            // if column at current index is true
            if (column[j]) {
                // call nullifyCollumn using matrix and current index as parameter
                nullifyColumn(matrix, j);
            }
        }
    }

    // helper nullifyRow function 
    public static void nullifyRow (int[][] matrix, int row) {
        // loop through matrix[0] length
        for (int j = 0; j < matrix[0].length; j++) {
            // set matrix [row][current index] to 0
            matrix[row][j] = 0;
        }   
    }

    // helper nullifyColumn function
    public static void nullifyColumn (int[][] matrix, int column) {
        // loop through matrix length
        for (int i = 0; i < matrix.length; i++) {
            // set matrix [current index][col] to 0
            matrix[i][column] = 0;
        }
    }
}    

