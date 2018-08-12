package com.vinz;

public class Main {

    public static void main(String[] args) {
	// write your code here
    RangeRover rangeRover = new RangeRover(60);
    rangeRover.changeVelocity(45,22);
    rangeRover.steer(35);
    //rangeRover.changeVelocity(45,22);
    rangeRover.accelerate(45);
    rangeRover.accelerate(15);
    }
}
