package com.vinz;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240AC", dimensions);
        Monitor theMonitor = new Monitor("27 inch", "HP", 27, new Resolution(2540, 1440)); //creating instance of class without using varaible
        Motherboard theMotherboard = new Motherboard("220-B", "Intel", 4, 6, "v2.01");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//      thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getTheCase().pressPowerButton();
//        thePC.getMotherboard().loadProgram("windows");
        //the above methods wont work now as we have eliminated getters from the PC class
       thePC.powerUp();
    }
}
