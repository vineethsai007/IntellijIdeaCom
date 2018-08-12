package com.vinz;

public class Animal {
    private String name;
    private int brain;
     private int body;
     private int size;
     private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    public void eat(){
        //coz all animals eat
    }
    public void move(int speed){
        System.out.println("Animal.move() is being called, animal is moving at a speed of "+ speed+" kmph");
        //coz all animals move; we could add tailor made methods like this to the super class and extend it to other classes
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
