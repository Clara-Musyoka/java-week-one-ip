package org.safaricom;

public class Decoding {
    //to keep track of index
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String decode(String cipherText, int shiftKey) {
        cipherText = cipherText.toLowerCase();
        String message = "";
        for (int ii = 0; ii < cipherText.length(); ii++) {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(ii));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0) {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            message += replaceVal;
        }
        return message;
    }
}
