package com.NotKatsu.test;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        String word = "banana";
//
//        if (word.equals("banana")) {
//            System.out.println("Word is banana!");
//        } else if (word.equals("pear")) {
//            System.out.println("Eww Pears are bad!!");
//        }
//
//        switch (word) {
//            case "banana":
//                System.out.println("Wow banana");
//                break;
//            case "pear":
//                System.out.println("Ew pear");
//                break;
//            case "kiwi":
//                System.out.println("These are kinda nice...");
//                break;
//            default:
//                System.out.println("At least give me a fruit..");
//        }

//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//
//        calendar.add(Calendar.DAY_OF_YEAR, 1);
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        Random random = new Random();

        for (int count = 0; count <= 100; count++) {
            System.out.println(random.nextInt(10));
        }
    }
}
