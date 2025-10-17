package leetcode;

/**

    The letter value of a letter is its position in the alphabet starting from 0 
    (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).

    The numerical value of some string of lowercase English letters s 
    is the concatenation of the letter values of each letter in s, 
    which is then converted into an integer.

        For example, if s = "acb", we concatenate each letter's letter value, 
        resulting in "021". After converting it, we get 21.

    You are given three strings firstWord, secondWord, and targetWord, 
    each consisting of lowercase English letters 'a' through 'j' inclusive.

    Return true if the summation of the numerical values of firstWord 
    and secondWord equals the numerical value of targetWord, or false otherwise.
    

    Example 1:

    Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
    Output: true
    Explanation:
    The numerical value of firstWord is "acb" -> "021" -> 21.
    The numerical value of secondWord is "cba" -> "210" -> 210.
    The numerical value of targetWord is "cdb" -> "231" -> 231.
    We return true because 21 + 210 == 231.

 */

public class CheckIfWordEqualsSummationOfTwoWords {

    // Time: O(n)
    // check if word equals summation of two words
    public static boolean checkIfWordEqualsSummationOfTwoWords (String firstWord, String secondWord, String targetWord) {
        // init stringbuilder sb1
        StringBuilder sb1 = new StringBuilder();
        // init stringbuilder sb2
        StringBuilder sb2 = new StringBuilder();
        // init stringbuilder sbTarget
        StringBuilder sbTarget = new StringBuilder();

        // for each char in firstWord
        for (char c : firstWord.toCharArray()) {
            // to sb1 append char minus 'a'
            sb1.append(c - 'a');
        }

        // for each char in secondWord
        for (char c : secondWord.toCharArray()) {
            // to sb2 append char minus 'a'
            sb2.append(c - 'a');
        }
        
        // for each char in targetWord
        for (char c : targetWord.toCharArray()) {
            // to sbTarget append char minus 'a'
            sbTarget.append(c - 'a');
        }

        // init firstNum to integer value of sb1 to string
        int firstNum = Integer.valueOf(sb1.toString());
        // init secondNum to integer value of sb2 to string
        int secondNum = Integer.valueOf(sb2.toString());
        // init targetNum to integer value of sbTarget to string
        int targetNum = Integer.valueOf(sbTarget.toString());

        // return if firstNum plus secondNum equals targetNum
        return firstNum + secondNum == targetNum;
    }



    // main
    public static void main(String[] args) {
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";
        System.out.println(checkIfWordEqualsSummationOfTwoWords(firstWord, secondWord, targetWord));
    }
}
