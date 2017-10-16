package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        Encryption encrypt = new Encryption(input);
    }
}
