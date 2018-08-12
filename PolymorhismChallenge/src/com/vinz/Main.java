package com.vinz;
 class Car{
    private int wheels;
    private boolean engine;
    private String name;
    private int cylinders;

     public Car(String name, int cylinders) {
         this.name = name;
         this.cylinders = cylinders;
         this.engine = true;
         this.wheels= 4;
     }

     public String getName() {
         return name;
     }

     public int getCylinders() {
         return cylinders;
     }
     public String startEngine(){
         return getClass().getSimpleName() +"-> startEngine()";

     }
     public String accelerate(){
         return getClass().getSimpleName() +" -> accelerate()";

     }
     public String brake(){
         return getClass().getSimpleName() +"-> brake()";

     }


 }
class Porsche extends Car{
    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Porsche -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Porsche -> accelerate()";
    }

    @Override
    public String brake() {
        return "Porsche -> brake()";
    }
}

class Mercedes extends Car{
    public Mercedes(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mercedes -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mercedes -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mercedes -> brake()";
    }
}

class BmwSedan extends Car{
    public BmwSedan(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "BmwSedan -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "BmwSedan -> accelerate()";
    }

    @Override
    public String brake() {
        return "BmwSedan -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Basic Model Car",4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Porsche porsche = new Porsche("carrera 917",6);
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.brake());

        Mercedes mercedes = new Mercedes("G-Wagon",8);
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());

        BmwSedan bmwSedan = new BmwSedan("720Ldi",10);
        System.out.println(bmwSedan.startEngine());
        System.out.println(bmwSedan.accelerate());
        System.out.println(bmwSedan.brake());

    }


}
