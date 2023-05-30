package com.NotKatsu.test;

public class Main {
    public static void main(String[] args) {
        // PRIMITIVE
        int number = 5;

        double decimal_number = 104.2;

        boolean true_boolean = true;
        boolean false_boolean = false;

        char letter = 'a';

        // NON-PRIMITIVE
        String blank_sentence;
        String sentence = "This is my sentence";

        Integer number_2 = 5;
        Double decimal_number_2 = 104.2;

        Boolean true_boolean_2 = true;
        Boolean false_boolean_2 = false;

        Character letter_2 = 'a';

        print_message("This is our message and it has been ran.");
        print_message("Wow OUR message is so cool...");
    }

    private static void print_message(String message) {
        System.out.println(message.toLowerCase());
    }
}