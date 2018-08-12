package com.vinz;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Wall wall1 = new Wall("South");
        Wall wall2 = new Wall("North");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(12, 55);
        Lamp lamp = new Lamp("bedLamp", true, 5);
        Bed bed = new Bed("queen", 4, 5, 3, 1);

        Bedroom bedroom = new Bedroom("Vinz", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}

