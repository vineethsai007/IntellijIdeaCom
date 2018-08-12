package com.vinz;

public class Main {

    public static void main(String[] args) {
	 //Car porsche; //step1 creating object
        //whenever we use a class we need to initialize the class i.e.
        Car porsche = new Car(); //created object called porsche based on template called Car
        Car bmw = new Car();
        System.out.println("model is "+porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("model is "+porsche.getModel());

    }
}
