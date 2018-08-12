package com.vinz;

public class Main {

    public static void main(String[] args) {
        System.out.println( "is a prime number "+ isPrime(113));

    int count = 0;
    for(int i =20;i<50;i++) {
        if(isPrime(i)) {
            count++;
            System.out.println("number " + i + " is a prime number");
            if(count==3){
                System.out.println("loop exits as we printed " + count +" no of primes. might be more in range");
                break;
        }

        }
    }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i <= n / 2; i++) //less no of computations
                {
            //for (int i = 2;i<= (long) Math.sqrt(n); i++) // further reduced computations {
                System.out.println("loop is run when i=  " + i);
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}


