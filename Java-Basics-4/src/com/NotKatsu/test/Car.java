package com.NotKatsu.test;

public class Car extends Vechicle {
    public Car() {
        super(4, "Blue");
        calculate();
    }
    
    public void handbrake() {
        System.out.println("Car has stopped...");
    }
}
