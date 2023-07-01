package org.safaricom;

public class Decoding {
    // to keep track of index
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String decode(String cipherText, int shiftKey) {
        cipherText = cipherText.toLowerCase();
        StringBuilder message = new StringBuilder();
        for (int ii = 0; ii < cipherText.length(); ii++) {
            char currentChar = cipherText.charAt(ii);
            if (!Character.isLetter(currentChar)) {
                // Ignore non-alphabetic characters
                message.append(currentChar);
                continue;
            }
            int charPosition = ALPHABET.indexOf(currentChar);
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0) {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            message.append(replaceVal);
        }
        return message.toString();
    }
}