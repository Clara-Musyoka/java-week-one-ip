package org.safaricom;
public class Encoding {
    // to keep track of index
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static String encode(String message, int shiftKey) {
        message = message.toLowerCase();
        StringBuilder cipherText = new StringBuilder();
        for (int ii = 0; ii < message.length(); ii++) {
            char currentChar = message.charAt(ii);
            if (!Character.isLetter(currentChar)) {
                // Ignore non-alphabetic characters
                cipherText.append(currentChar);
                continue;
            }
            int charPosition = alpha.indexOf(currentChar);
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = alpha.charAt(keyVal);
            cipherText.append(replaceVal);
        }
        return cipherText.toString().toUpperCase();
    }
}
