/**
 * This class replaces all spaces in a String with "%20".
 */

public class URLify {
    
    // URLify using brute force
    public static void urlify(String str, int trueLength) {
        // initialize char array from str
        char[] strCharacters = str.toCharArray();
        // initialize space counter
        int spaceCounter = 0;

        // loop through true length
        for (int i = 0; i < trueLength; i ++) {
            // if char array at loop index is a space
            if (strCharacters[i] == ' ') {
                // increace space counter by 1
                spaceCounter++;
            }
        }

        // initialze end index to trueLength plus space counter times 2
        int endIndex = trueLength + spaceCounter * 2;
        // loop through in reverse starting at trueLength - 1
        for (int i = trueLength - 1; i >= 0; i--) {
            // if char array at loop index is a space
            if (strCharacters[i] == ' ') {
                // set char array at end index - 1 to '0'
                strCharacters[endIndex - 1] = '0';
                // set char array at end index - 2 to '2'
                strCharacters[endIndex - 2] = '2';
                // set char array at end index - 3 to '%'
                strCharacters[endIndex - 3] = '%';
                // decrease end index by 3
                endIndex -= 3;
            } else {    // else it's a char
                // set char array at end index - 1 to char array at loop index
                strCharacters[endIndex - 1] = strCharacters[i];
                // decrease end index by 1
                endIndex--;
            }
        }   
        // testing
        System.out.println(String.valueOf(strCharacters));
    }

    // main method
    public static void main(String[] args) {
        String sentence = "Lots of words    ";
        int trueLength = 13;
        urlify(sentence, trueLength);
    }
}


