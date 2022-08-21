package leetcode;

/**

    You are given a sentence s​​​​​​ and an integer k​​​​​​. 
    You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.
    

    Example 1:

    Input: s = "Hello how are you Contestant", k = 4
    Output: "Hello how are you"

*/

public class TruncateSentence {
    
    // Time: O()
    // truncate sentence
    public static String truncateSentence (String s, int k) {
        // init Stringbuilder sb
        StringBuilder sb = new StringBuilder();
        // init spaceCount to 0
        int spaceCount = 0;

        // for each char in s
        for (char c : s.toCharArray()) {
            // if char equals ' '
            if (c == ' ') {
                // increase spaceCount by 1
                spaceCount++;
            }
            // if spaceCount equals k
            if (spaceCount == k) {
                // break
                break;
            }
            // to sb append char
            sb.append(c);
        }

        // return sb to string
        return sb.toString();
    }

    // main
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }
}
