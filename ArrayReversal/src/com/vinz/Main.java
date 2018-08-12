package com.vinz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {1,5,7,9,3};
        System.out.println("originl array is :"+Arrays.toString(array));
        reverseArray(array);
        System.out.println("reversed array is:"+Arrays.toString(array));
    }
    private static void reverseArray(int[] array){
        int maxIndex = array.length -1;
        int halfLength = array.length/2;
        for(int i =0;i<halfLength;i++){
            int temp = array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i]= temp;

        }
    }
}
