package com.NotKatsu.test;

public class Vechicle {
    private int wheels;
    private String color;

    public Vechicle(int wheels, String color) {
        this.wheels = wheels;
        this.color = color;
    }

    public int get_wheels() {
        return wheels;
    }

    public String get_color() {
        return color;
    }

    public int calculate() {
        return wheels * 2;
    }
}
