package com.NotKatsu.test;

public enum CoffeeSize {
    SMALL("Small", 2, "$"),
    MEDIUM("Medium", 4, "$"),
    LARGE("Large", 7, "$");

    private String name;
    private int price;

    private String currency_symbol;

    CoffeeSize(String name, int price, String currency_symbol) {
        this.name = name;
        this.price = price;
        this.currency_symbol = currency_symbol;
    }

    public String get_name() { return name; }
    public int get_price() { return price; }

    public String get_currency_symbol() { return currency_symbol; }
}
