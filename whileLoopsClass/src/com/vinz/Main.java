package com.vinz;

public class Main {

    public static void main(String[] args) {
      /* int count =1;
       while(count != 6){
           System.out.println("count is "+ count);
           count++;

           }
        for( int i =1;i!=6;i ++ ){
            System.out.println("count is "+ i);
      // for( count =1;count!=6;count ++ ){
           // System.out.println("count is "+ count);
    }
*/
//int number =3;
//int finishNumber = 20;
//while(number <= finishNumber){
//    //checks from next number i.e. from 4 due to number++
//    number++;
//    if(!isEvenNUmber(number)){
//        continue;
        //loop continues if number is odd but doesnt go to sout in next line if it returns false
//    }
//    System.out.println("even number is "+number);
//    int sum =+ number;
////    System.out.println("sum of these numbers = "+number);
//}
  //}

        int number = 3;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber) {
            //checks
            // from next number i.e. from 4 due to number++
            number++;
            if (!isEvenNUmber(number)) {
                continue;
            }
            evenNumbersFound++;
             if(evenNumbersFound >=5) {
                 break;
        }

        System.out.println("even numbers found = "+evenNumbersFound);
            }
            public static boolean isEvenNUmber ( int number)
        {
                    if (number % 2 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }

