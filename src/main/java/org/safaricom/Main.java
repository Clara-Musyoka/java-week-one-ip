package org.safaricom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInputObject = new Scanner(System.in);

        do {
            System.out.println("Select process (e-encoding/d-decoding)");
            String process = userInputObject.next();


            System.out.println("Enter Message: ");
            String message = userInputObject.next();

            System.out.println("Enter Key: ");
            int key = userInputObject.nextInt();


            //encoding process
if(process.startsWith("e")){
    System.out.println("\nEncrpyted msg:" + Encoding.encode(message, key));
}else if(process.startsWith("d")){
    System.out.println("\nDecrypted Message:" + Decoding.decode(message, key));

}else{
    System.out.println("invalid process");
    continue;
}

            System.out.println("Do you want to Quit or Continue? ");
            String nextStep = userInputObject.next();
            if (nextStep.startsWith("q")) {
                break;
            }
        } while (true);
    }
}