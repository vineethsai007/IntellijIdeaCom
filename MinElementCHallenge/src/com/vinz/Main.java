package com.vinz;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("enter number of integers to be inputted");
        int count = scanner.nextInt();
        scanner.nextLine();
        //make call to the readInteger method
        int[] returnedArray = readInteger(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("Minimum element in array is :"+returnedMin);

    }
    private static int[] readInteger(int count) {
    int[] array = new int[count];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the number");
            int number = scanner.nextInt();
            scanner.nextLine(); // make sure that on entering ENTER key we accept next number
            array[i]= number;

        }
        return array; //return the populated array

    }
    private static int findMin(int [] array){
        int min = Integer.MAX_VALUE; // to assure that value returned is min but not 0;
        for(int i =0;i<array.length;i++){
            int value = array[i];// to retrieve element at position i; // time complexity is big oh of array.length
            if(value<min){
                min = value;

            }

        }
        return min;


    }

    }


