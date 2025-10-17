package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a string s in the format "<col1><row1>:<col2><row2>", where <col1> represents the column c1, 
 * <row1> represents the row r1, <col2> represents the column c2, 
 * and <row2> represents the row r2, such that r1 <= r2 and c1 <= c2.
 * 
 * Return the list of cells (x, y) such that r1 <= x <= r2 and c1 <= y <= c2. 
 * The cells should be represented as strings in the format mentioned above 
 * and be sorted in non-decreasing order first by columns and then by rows.
 * 
 * Example 1:
 * 
 * Input: s = "K1:L2"
 * Output: ["K1","K2","L1","L2"]
 
 */
public class CellsInRange {
    
    // Time: O(n*m)
    // cells in range using while loops
    public static List<String> cellsInRange (String s) {
        // initialize cellList
        List<String> cellList = new ArrayList<>();

        // initialize startColumn to s char at 0
        char startColumn = s.charAt(0);
        // initialize startRow to s char at 1
        char startRow = s.charAt(1);
        // initialize endColumn to s char at 3
        char endColumn = s.charAt(3);
        // initialize endRow to s char at 4
        char endRow = s.charAt(4);

        // while startColumn is less than or equal to endColumn
        while(startColumn <= endColumn) {
            // while startRow is less than or equal to endRow
            while (startRow <= endRow) {
                // initialize Stringbuilder sb
                StringBuilder sb = new StringBuilder();
                // to sb append startColumn
                sb.append(startColumn);
                // to sb append startRow
                sb.append(startRow);
                // to cellList add sb to string
                cellList.add(sb.toString());
                // increse startRow by 1
                startRow++;
            }
            // after inner while loop increase startColumn by 1
            startColumn++;
            // set startRow to s char at 1
            startRow = s.charAt(1);
        }

        // return cellList
        return cellList;
    }

    // main method
    public static void main(String[] args) {
        String s = "K1:L2";
        System.out.println(cellsInRange(s));
    }
}
