package com.NotKatsu.test;

public class Main {
    public static void main(String[] args) {
        String message = "HELLo WorLd!";

        if (message.toLowerCase().contains("world")) {
            System.out.println("message contains the word world!");
        } else {
            System.out.println("message does not contain the word world!");
        }
    }
}
