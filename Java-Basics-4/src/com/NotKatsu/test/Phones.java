package com.NotKatsu.test;

public enum Phones {
    IPhone_11("Red", 600, "Bad"),
    IPhone_12("Blue", 800, "Good"),
    IPhone_13("Purple", 1200, "Extremely Good");

    private String color;
    private int price;
    private String camera_quality;

    Phones(String color, int price, String camera_quality) {
        this.color = color;
        this.price = price;
        this.camera_quality = camera_quality;
    }

    public String get_color() {return color;}
    public int get_price() {return price;}
    public String get_camera_quality() { return camera_quality; }
}
