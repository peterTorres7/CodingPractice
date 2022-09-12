package leetcode;

/**

    You are given coordinates, a string that represents the coordinates of a square of the chessboard. 
    Below is a chessboard for your reference.

    Return true if the square is white, and false if the square is black.

    The coordinate will always represent a valid chessboard square. 
    The coordinate will always have the letter first, and the number second.
    

    Example 1:

    Input: coordinates = "a1"
    Output: false
    Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.

 */

public class DetermineColorOfAChessboardSquare {
    
    // Time: O(n)
    // determine color of a chessboard square
    public static boolean determineColorOfAChessboardSquare (String coordinates) {
        // init first to coordinates char at 0
        int first = coordinates.charAt(0) - 'a';
        // init second to coordinates char at 1 
        int second = coordinates.charAt(1) - '0';
        
        // if first is even AND second is even OR first is odd AND second is odd return true else false
        return (first % 2 == 0 && second % 2 == 0) || (first % 2 != 0 && second % 2 != 0) ? true : false;
    }


    // main
    public static void main(String[] args) {
        String coordinates = "a1";
        System.out.println(determineColorOfAChessboardSquare(coordinates));
    }
}
