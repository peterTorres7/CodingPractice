package leetcode;

import java.util.ArrayList;
import java.util.List;

/**

    You are keeping the scores for a baseball game with strange rules. 
    At the beginning of the game, you start with an empty record.

    You are given a list of strings operations, 
    where operations[i] is the ith operation you must apply to the record and is one of the following:

        An integer x.
            Record a new score of x.
        '+'.
            Record a new score that is the sum of the previous two scores.
        'D'.
            Record a new score that is the double of the previous score.
        'C'.
            Invalidate the previous score, removing it from the record.

    Return the sum of all the scores on the record after applying all the operations.

    The test cases are generated such that the answer 
    and all intermediate calculations fit in a 32-bit integer and that all operations are valid.

    
    Example 1:

    Input: ops = ["5","2","C","D","+"]
    Output: 30
    Explanation:
    "5" - Add 5 to the record, record is now [5].
    "2" - Add 2 to the record, record is now [5, 2].
    "C" - Invalidate and remove the previous score, record is now [5].
    "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
    "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
    The total sum is 5 + 10 + 15 = 30.

 */

public class BaseballGame {
    
    // Time: O(n)
    // baseball game using array list
    public static int baseballGame (String[] operations) {
        // init sum to 0
        int sum = 0;
        // init scores to new arraylist
        List<Integer> scores = new ArrayList<>();

        // for each operation in operations
        for (String operation : operations) {
            // if operation equals "C"
            if (operation.equals("C")) {
                // to scores remove last score
                scores.remove(scores.size() - 1);
            // else if operation equals "D"
            } else if (operation.equals("D")) {
                // to scores add last score times 2
                scores.add(scores.get(scores.size() - 1) * 2);
            // else if operation equals "+"
            } else if (operation.equals("+")) {
                // to scores add last score plus second to last score 
                scores.add(scores.get(scores.size() - 1) + scores.get(scores.size() - 2));
            } else {
                // else scores add integer value of operaion            
                scores.add(Integer.valueOf(operation));
            }
        }
        
        // for each score in scores
        for (int score : scores) {
            // to sum add score
            sum += score;
        }

        // return sum
        return sum;
    }



    // main
    public static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};
        System.out.println(baseballGame(operations));
    }

}
