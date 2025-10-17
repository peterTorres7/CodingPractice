package leetcode;

/**
    You own a Goal Parser that can interpret a string command. The command 
    consists of an alphabet of "G", "()" and/or "(al)" in some order. 
    The Goal Parser will interpret "G" as the string "G", "()" as the string "o", 
    and "(al)" as the string "al". The interpreted strings are then concatenated 
    in the original order.

    Given the string command, return the Goal Parser's interpretation of command.

    

    Example 1:

    Input: command = "G()(al)"
    Output: "Goal"
    Explanation: The Goal Parser interprets the command as follows:
    G -> G
    () -> o
    (al) -> al
    The final concatenated result is "Goal".

*/

public class GoalParserInterpretation {

    // Time: O(n)
    // goal parser interpretation using one pointer
    public static String goalParserInterpretation (String command) {
        // initialize stringbuilder sb
        StringBuilder sb = new StringBuilder();
        // inititalize command pointer to 0
        int commandPointer = 0;

        // while command pointer is less than command length
        while (commandPointer < command.length()) {
            // if command char at command pointer is equal to 'G'
            if (command.charAt(commandPointer) == 'G') {
                // to sb append "G"
                sb.append("G");
                // increase command pointer by 1
                commandPointer++;
            // else if command char at command pointer is equal to '(' 
            // AND command char at command pointer plus 1 is equal to ')'
            } else if (command.charAt(commandPointer) == '(' && command.charAt(commandPointer + 1) == ')') {
                // to sb append "o"
                sb.append("o");
                // increase command pointer by 2
                commandPointer += 2;
            } else {
                // else to sb append "al"
                sb.append("al");
                // increase command pointer by 4
                commandPointer += 4;
            }
        }

        // after loop return sb to string
        return sb.toString();
    }

    // main method
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(goalParserInterpretation(command));
    }

}
