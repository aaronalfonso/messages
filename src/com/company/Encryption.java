package com.company;

import java.util.*;

/**
 * Created by aa700 on 10/16/17.
 */
public class Encryption {
    
    private double dKey = Math.random() * (Math.random() * 10);
    private char key = (char)dKey;
    private double ppKey = Math.random() * (Math.random() * 10);
    private char pKey = (char)ppKey; //Private Key
    private int length;
    private String encrypted;
    private char encryptedArray[];

    public Encryption(String word) {
        encrypted = word;
        length = word.length();
    }
    public int getKey(){
        return key;
    }
    public String encrypt(String message){
        encryptedArray = encrypted.toCharArray();
        for (int i=0; i<length; i++) {
            encryptedArray[i] += key + pKey;
        }
        encrypted = Arrays.toString(encryptedArray);
        encrypted = encrypted.replaceAll(",", "");
        encrypted = encrypted.replaceAll(" ", "");
        encrypted = encrypted.replaceAll("\\[", "");
        encrypted = encrypted.replaceAll("\\]", "");
        return encrypted;
    }
    public String decrypt(int x) {
        encryptedArray = encrypted.toCharArray();
        for (int i=0; i<length; i++) {
            encryptedArray[i] -= x + pKey;
        }
        encrypted = Arrays.toString(encryptedArray);
        encrypted = encrypted.replaceAll(",", "");
        encrypted = encrypted.replaceAll(" ", "");
        encrypted = encrypted.replaceAll("\\[", "");
        encrypted = encrypted.replaceAll("\\]", "");
        return encrypted;
    }
}
