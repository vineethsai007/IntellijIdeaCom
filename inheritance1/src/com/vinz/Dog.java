package com.vinz;

public class Dog extends Animal {

    private int eyes;
    private String tailShape;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;

    public Dog(String name, int size, int weight,int eyes, String tailShape, int legs, int teeth, int tail, String coat) {
        super(name, 2, 1, size, weight);

        this.eyes = eyes;
        this.tailShape = tailShape;
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("dog.chew() is called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() is called");
        chew();
        super.eat();/* this is unique to dog, similar instance can be found in animal */
        //super keyword points back to super class here it is animal;
    }
    public void walk(){
        //move(5);
        super.move(5);
        System.out.println("dog.walk() is called");
    }
    public void run(){
        move(10);
        System.out.println("dog.run() is called");
    }
    public void moveLegs(int speed){
        System.out.println("dog.moveLegs() is called");
    }
    @Override
    public void move(int speed) {
        System.out.println("dog.move() is called");
        moveLegs (speed);
        super.move(speed);
    }
}