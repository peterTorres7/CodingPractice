/**
 * This class replaces all spaces in a String with "%20".
 */

public class URLify {                                                          
    
    // URLify using brute force
    public static void urlify(String str, int trueLength) {
        // initialze strChars with str as char array
        char[] strChars = str.toCharArray();
        // initilize space counter to 0
        int spaceCounter = 0;
        // loop through strChars until trueLength - 1
        for (int i = 0; i < trueLength; i++) {
            // if char is a space
            if (strChars[i] == ' ') {
                // increase space counter by 1
                spaceCounter++;
            }
        }

        // initialize lastCharCount to trueLength + space counter * 2 
        int lastCharCount = trueLength + spaceCounter * 2;
        // loop backwards through strChars starting at trueLength - 1 
        for (int i = trueLength - 1; i >= 0; i--) {
            // if char at current loop index is a space
            if (strChars[i] == ' ') {
                // set strChars at lastCharCount - 1 to '0'
                strChars[lastCharCount - 1] = '0';
                // set strChars at lastCharCount - 2 to '2'
                strChars[lastCharCount - 2] = '2';
                // set strChars at lastCharCount - 3 to '%'
                strChars[lastCharCount - 3] = '%';
                // decrease lastCharCount by 3
                lastCharCount -= 3;
            // else it's a char
            } else {
                // set strChars at lastCharCount - 1 to strChars at current loop index
                strChars[lastCharCount - 1] = strChars[i];
                // decrease lastcharCount by 1
                lastCharCount--;
            }
        }

        // testing
        System.out.println(String.valueOf(strChars));

    }

    // main method
    public static void main(String[] args) {
        String sentence = "Lots of words    ";
        int trueLength = 13;
        urlify(sentence, trueLength);
    }
}


