package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> msg = new ArrayList<String>();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter name");
        String name = userInput.nextLine();

        System.out.println("To enter a message, just type!");
        System.out.println("Type 'stop' to exit program");
        while(true){
            msg.add(userInput.nextLine());
            if(msg.contains("stop")){
                System.exit(1);
            }
            for(int i=0; i<msg.size(); i++){
                System.out.println(name + ": " + msg.get(i));
            }

        }
    }
}
