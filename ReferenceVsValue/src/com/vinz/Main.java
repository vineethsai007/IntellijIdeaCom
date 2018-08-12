package com.vinz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
     int myValue = 10;
     int anotherValue = myValue;

        System.out.println("my value is "+myValue);
        System.out.println("anotherValue is "+anotherValue);

        anotherValue ++;
        System.out.println(" after increment of another value, myValue is "+myValue);
        System.out.println("incremented anotherValue is "+anotherValue);
//expected output is that both the int change because we are assigning "anotherValue = myValue"
//in the next step we incrementing another value, but only another gets incrmeented
//it is because in this dataTypes both of them act as individual varibles after equaling them

        int[] myArray = new int[5];
        int [] anotherArray = myArray; //copying
        System.out.println(" myArray ="+Arrays.toString(myArray));
        System.out.println(" anotherArray =" + Arrays.toString(anotherArray));

        myArray[0]=21;
        anotherArray[2]=22;

        System.out.println("  After modification myArray ="+Arrays.toString(myArray));
        System.out.println(" After modification anotherArray =" + Arrays.toString(anotherArray));

        anotherArray =new  int[]{4,6,7,8,2};
        modifyArray(myArray);

        System.out.println("  After modifyArray call myArray ="+Arrays.toString(myArray));
        System.out.println(" After modifyArray call anotherArray =" + Arrays.toString(anotherArray));

    }
    private static void modifyArray(int[] array){
        array[2]=18;
        array = new int[]{1,2,4,5,10};

    }
}
