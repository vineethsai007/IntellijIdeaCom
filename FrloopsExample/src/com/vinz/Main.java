package com.vinz;

public class Main {

   /* public static void main(String[] args) {
        for(int i=2; i<9;i++){
            System.out.println("interestPaid If interest rate is "+ i +"% "+ String.format("%.3f",(double)calculateInterest(100000d, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * interestRate / 100);
    }
}
*/
   public static void main(String[] args) {
       for(int i=8; i>1;i--){
           System.out.println("interestPaid If interest rate is "+ i +"% "+ String.format("%.3f",(double)calculateInterest(100000d, i)));
       }
   }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * interestRate / 100);
    }
}

