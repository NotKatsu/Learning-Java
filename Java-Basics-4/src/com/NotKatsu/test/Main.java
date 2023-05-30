package com.NotKatsu.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vechicle> vechicleList = new ArrayList<>();
        vechicleList.add(new Car());
        vechicleList.add(new Motorbike());

        vechicleList.get(0).get_color();
    }
}
