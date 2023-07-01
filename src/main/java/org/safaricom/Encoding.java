package org.safaricom;

public class Encoding {
    //to keep track of index
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static String encode(String message, int shiftKey) {
        message = message.toLowerCase();
        String cipherText = "";
        for (int ii = 0; ii < message.length(); ii++) {
            int charPosition = alpha.indexOf(message.charAt(ii));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = alpha.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }
}
