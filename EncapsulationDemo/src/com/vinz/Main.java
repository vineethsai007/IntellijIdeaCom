package com.vinz;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50,false);
        System.out.println("intital page count = "+printer.getPagesPrinted());
        int pagesPrinted= printer.printPages(7);
        System.out.println("Pages printed were "+ pagesPrinted+ "; New total page count after printing "+printer.getPagesPrinted());
         pagesPrinted= printer.printPages(2);
        System.out.println("Pages printed were "+ pagesPrinted+ "; New total page count after printing "+printer.getPagesPrinted());
    }
}
