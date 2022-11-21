package leetcode;

/**
You are given an array of n strings strs, all of the same length.

The strings can be arranged such that there is one on each line, making a grid. 
For example, strs = ["abc", "bce", "cae"] can be arranged as:

abc
bce
cae

You want to delete the columns that are not sorted lexicographically. 
In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted 
while column 1 ('b', 'c', 'a') is not, so you would delete column 1.

Return the number of columns that you will delete.


Example 1:

Input: strs = ["cba","daf","ghi"]
Output: 1
Explanation: The grid looks as follows:
  cba
  daf
  ghi
Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.

 */

public class DeleteColumnsToMakeSorted {

    // Time: O(n*m)
    // delete columns to make sorted
    public static int deleteColumnsToMakeSorted (String[] strs) {
        // init ans to 0
        int ans = 0;

        // for each char i in first string
        for (int i = 0; i < strs[0].length(); i++) {
            // for each str j in strs length minus 1
            for (int j = 0; j < strs.length - 1; j++) {
                // if strs at j char at i is greater than str at j plus 1 char at i
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    // increase ans by 1
                    ans++;
                    // break  
                    break;
                }
            }
        }

        // return ans
        return ans;
    }



    // main
    public static void main(String[] args) {
        String[] strs = {"cba","daf","ghi"};
        System.out.println(deleteColumnsToMakeSorted(strs));
    }
}
