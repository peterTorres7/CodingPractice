package leetcode;

/**
 * This class finds the final value after an array of operations are performed on it."
 */

public class FinalValueAfterOperations {
    
    // Time: O(n)
    // final value of variable after performing operations 
    public static int finalValueAfterOperations(String[] operations) {
        // initialize x to 0
        int x = 0;
        // loop through operations
        for(String operation : operations) {
            // if operations at current index is equal to "++X" OR "X++" 
            if(operation.equals("++X") || operation.equals("X++")) {
                // increase x by 1
                x++;
            } else {
                // else decrease x by 1
                x--;
            }
        }
        // after loop return x
        return x;
    }

    // main method
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

}
