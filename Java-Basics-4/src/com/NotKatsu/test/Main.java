package com.NotKatsu.test;

public class Main {
    public static void main(String[] args) {
//        CoffeeSize ordered = CoffeeSize.MEDIUM;
//
//        System.out.println(ordered.get_name() + " Coffee has just been ordered for " + ordered.get_currency_symbol() + ordered.get_price());

        Phones ordered = Phones.IPhone_11;

        System.out.println(ordered.name() + " Has been ordered in the color " + ordered.get_color() + " For $" + ordered.get_price());
    }
}
