package com.NotKatsu.test;

public class Main {
    public static void main(String[] args) {
        String word = "bean";

        if (word.equals("banana")) {
            System.out.println("Word is banana!");
        } else if (word.equals("pear")) {
            System.out.println("Eww Pears are bad!!");
        }

        switch (word) {
            case "banana":
                System.out.println("Wow banana");
                break;
            case "pear":
                System.out.println("Ew pear");
                break;
            case "kiwi":
                System.out.println("These are kinda nice...");
                break;
            default:
                System.out.println("At least give me a fruit..");
        }
    }
}
