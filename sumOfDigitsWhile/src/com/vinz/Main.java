package com.vinz;

public class Main {

    public static void main(String[] args) {
        System.out.println("sum of digits is "+sumDigits(2158888));

    }
    private static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sum = 0;
        while(number>0){
            //extract least sugnificant dgit
            int digit = number%10;
            sum += digit;
            //drop least significant digit
            number /= 10;  //is eqaul to number/10

         }
         return sum;
    }
}
