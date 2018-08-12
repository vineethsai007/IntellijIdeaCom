package com.vinz;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp() {
        //getTheCase.pressPowerButton(); geetrs have been removed and direct acess of variables is desired
       theCase.pressPowerButton(); // direct object access
        drawLogo();
    }
    private void drawLogo(){
       // getMonitor().drawPixelAt(1500,1200,"yellow"); can be accessed instead of getter by direct reference to variable;
        monitor.drawPixelAt(1500,1200,"yellow");
    }
//    public Case getTheCase() {
//        return theCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//    private Case getTheCase() {
//        return theCase;
//
//        /// did private so that direct access to the objects in main class can be curbed.
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
    //step 2: remove the getters so that code complexity is reduced. we can access variables directly

}
