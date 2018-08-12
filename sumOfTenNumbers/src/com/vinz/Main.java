package com.vinz;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    int counter = 0;
    int sum = 0;
   // while(true){   //another way to do this is counter<10
        while(counter <10){
        int order = counter + 1;
        System.out.println("enter number # "+order+":");

        boolean isAnInt = scanner.hasNextInt();

        if(isAnInt) {
            int number = scanner.nextInt();
            counter++;
            sum += number;
           // if (counter == 10) {   // we donot need this anymore as the loop breaks at 10
               // break;
            //}
        }
        else {
            System.out.println("invalid number not functional as input");
        }

    scanner.nextLine(); //to handle "enter" button after giving one input
    }
        System.out.println("Sum of thesec 10 numbers is "+sum);
	scanner.close();
    }
}
