package leetcode;

/**

    There is a robot starting at the position (0, 0), the origin, on a 2D plane. 
    Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

    You are given a string moves that represents the move sequence of the robot 
    where moves[i] represents its ith move. 
    Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).

    Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.

    Note: The way that the robot is "facing" is irrelevant. 
    'R' will always make the robot move to the right once, 'L' will always make it move left, etc. 
    Also, assume that the magnitude of the robot's movement is the same for each move.
    

    Example 1:

    Input: moves = "UD"
    Output: true

 */

public class RobotReturnToOrigin {
    
    // Time:O(n)
    // robot return to origin
    public static boolean robotReturnToOrigin (String moves) {
        // init leftRight to 0
        int leftRight = 0;
        // init upDown to 0
        int upDown = 0;

        // for each char in moves
        for (char c : moves.toCharArray()) {
            // if char is 'L'
            if (c == 'L') {
                // decrease leftRight by 1
                leftRight--;
            // else if char is 'R'      
            } else if (c == 'R') {
                // increase leftRight by 1
                leftRight++;
            // else if char is 'U'   
            } else if (c == 'U') {
                // increase upDown by 1
                upDown++;
            } else {
                // else decrease upDown by 1
                upDown--;
            }
        }

        // return if leftRight equals 0 AND upDown equal 0
        return leftRight == 0 && upDown == 0;
    }



    // main
    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(robotReturnToOrigin(moves));
    }
}
