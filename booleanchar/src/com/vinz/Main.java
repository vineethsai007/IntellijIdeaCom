package com.vinz;

public class Main {

    public static void main(String[] args) {
	char myChar = '\u0935';
	char mychar5 = '\u00AE';
        System.out.println(mychar5);
        char myChar1 = '\u093F';
        char myChar2 = '\u0929';
        char myChar3 = '\u0940';
        char myChar4 = '\u0924';
        System.out.println("my name is " + myChar+myChar1+myChar2+myChar3+myChar4);

        double double1 = 20;
        double double2 = 20;
        double double3 = (double1 + double2) *20;
        double remainder1 = double3 % 40;
        if (remainder1 >= 20)
            System.out.println("Total was over the limit and remainder is: " + remainder1);
        else{
            System.out.println("perfectly divides and remainder is" + remainder1);
        }
    }
}
