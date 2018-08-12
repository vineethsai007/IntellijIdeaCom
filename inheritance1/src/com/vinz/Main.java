package com.vinz;

public class Main {

    public static void main(String[] args) {
    Animal animal= new Animal("Animal", 1, 1, 4,25); // this is a gneral animal class makes no sense, so better call dog class

        Dog dog = new Dog("lab",4,25,2,"curved", 4, 24, 1, "furry"); // initializing dog

        dog.eat();
        System.out.println("name of animal is "+  dog.getName());
        dog.run();
        //dog.walk();
    }
}
