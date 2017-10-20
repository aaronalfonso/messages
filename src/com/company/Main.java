package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a message to encrypt.");
        String input = userInput.nextLine();
        Encryption encrypt = new Encryption(input);
        System.out.println("Your key is " + encrypt.getKey() + ". Use this key to decrypt your message.");
        System.out.println("");
        System.out.println("Your encrypted message is " + encrypt.encrypt(input) + ". Enter your key provided to decrypt.");
        int key = userInput.nextInt();
        System.out.println("Your decrypted message is " + encrypt.decrypt(key) + ".");

    }
}
