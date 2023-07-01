package org.safaricom;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInputObject = new Scanner(System.in);

        do {
            System.out.println("Select process (e-encoding/d-decoding):");
            String process = userInputObject.next().toLowerCase();

            if (process.startsWith("e")) {
                System.out.println("Enter Message:");
                String message = userInputObject.next();

                System.out.println("Enter Key:");
                int key = userInputObject.nextInt();

                System.out.println("Encrypted Message: " + Encoding.encode(message, key));
            } else if (process.startsWith("d")) {
                System.out.println("Enter Cipher Text:");
                String cipherText = userInputObject.next();

                System.out.println("Enter Key:");
                int key = userInputObject.nextInt();

                System.out.println("Decrypted Message: " + Decoding.decode(cipherText, key));
            } else {
                System.out.println("Invalid process. Please try again.");
                continue;
            }

            System.out.println("Do you want to Quit or Continue?");
            String nextStep = userInputObject.next().toLowerCase();
            if (nextStep.startsWith("q")) {
                break;
            }
        } while (true);

        userInputObject.close();
    }
}
