package com.vinz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*write your code here
        byte newByte = 100;
        short newShort = 10000;
        int newInt = 69_000;
        long newLong =  50000L + 10L*(newByte + newShort + newInt)  ;
        System.out.println("newLong = " + newLong );

        float myFloatNew = (float)6.7;
        float myFloatNew2 = 5f/3.5f;
        int myIntNew = 7/6;
        double myDoubleNew = 5d/6.5d;
        System.out.println("myFloatNew is" + myFloatNew);
        System.out.println("myIntNew is" + myIntNew);
        System.out.println("myIntNew is" + myDoubleNew); */

        double weightInPounds =  'n' ;
        Scanner scan1 = new Scanner (System.in);
        System.out.println("enter the weight in pounds");
        double user_input = scan1.nextDouble();
        double n = scan1.nextDouble();
        double weightInKilos =  n * 0.45359237d;
        System.out.println(" The weight in kilos is" + weightInKilos);



    }
}
