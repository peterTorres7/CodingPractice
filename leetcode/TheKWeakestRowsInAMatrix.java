package leetcode;

import java.util.Arrays;

/**

    You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). 
    The soldiers are positioned in front of the civilians. 
    That is, all the 1's will appear to the left of all the 0's in each row.

    A row i is weaker than a row j if one of the following is true:

        The number of soldiers in row i is less than the number of soldiers in row j.
        Both rows have the same number of soldiers and i < j.

    Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.


    Example 1:

    Input: mat = 
    [[1,1,0,0,0],
    [1,1,1,1,0],
    [1,0,0,0,0],
    [1,1,0,0,0],
    [1,1,1,1,1]], 
    k = 3
    Output: [2,0,3]

 */

public class TheKWeakestRowsInAMatrix {
    
    // Time: O(nlogn)
    // the k weakest rows in a matrix
    public static int[] theKWeakestRowsInAMatrix (int[][] mat, int k) {
        // init ans to int array of size k
        int[] ans = new int[k];
        // init totals to new int array of mat length, 2
        int[][] totals = new int[mat.length][2];

        // for each i in mat
        for (int i = 0; i < mat.length; i++) {
            // init soldiers to 0
            int soldiers = 0;
            // for each num in mat i
            for (int num : mat[i]) {
                // if num is equal to 1
                if (num == 1) {
                    // increase soldiers by 1
                    soldiers++;
                } else {
                    // else break  
                    break;
                }
            }
            // after inner for loop set totals at i to soldiers
            totals[i][0] = i;
            totals[i][1] = soldiers;            
        }

        // sort totals by soldiers
        Arrays.sort(totals, (a,b) -> Integer.compare(a[1],b[1]));
        
        // for each i to k
        for (int i = 0; i < k; i++) {
            // set ans at i to totals at i,0
            ans[i] = totals[i][0];
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        int[][] mat = {
                    {1,1,0,0,0},
                    {1,1,1,1,0},
                    {1,0,0,0,0},
                    {1,1,0,0,0},
                    {1,1,1,1,1}};
        int k = 3;
        System.out.println(Arrays.toString(theKWeakestRowsInAMatrix(mat, k)));
    }
}
