package leetcode;

/**
 * This class returns a defanged version of that IP address
 * given a valid (IPv4) IP address. It replaces every period "." with "[.]".
 */

public class DefangingAnIPAddress {
    
    // Time: O(n)
    // defangs an IP adress using StringBuilder
    public static String defangingAnIPAddress(String address) {
        //inititalze StringBuilder sb to new StringBuilder
        StringBuilder sb = new StringBuilder();
        // loop thourgh address length
        for (int i = 0; i < address.length(); i++) {
            // if address char at current index is equal to '.'
            if (address.charAt(i) == '.') {
                // to sb append "[.]"
                sb.append("[.]");
            } else {
                // else to sb append address char at current index
                sb.append(address.charAt(i));
            }
        }
        // after loop return sb as string
        return sb.toString();
    }

    // main method
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangingAnIPAddress(address));
    }
    
}
