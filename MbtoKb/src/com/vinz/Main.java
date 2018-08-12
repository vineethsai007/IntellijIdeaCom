package com.vinz;

public class Main {


    /*public static void main(String[] args) {
        bark(true, 23);
        System.out.println(bark(true, 20));
    }
//        printMegaBytesAndKiloBytes(-1);
//    }
////            public static void printMegaBytesAndKiloBytes (int kiloBytes){
////                if(kiloBytes > 0){
////                    int megaBytes = kiloBytes/1024  +  (int) kiloBytes%1024 ;
////                    System.out.println(kiloBytes + "kiloBytes" + "=" + megaBytes );
////
////            }
////
////        }    }
//public static void printMegaBytesAndKiloBytes(int kiloBytes){
//    int MB = 0;
//    int remainder = 0;
//    if (kiloBytes < 0)
//    {System.out.println("Invalid Value");
//    }
//    else if (kiloBytes>=0)
//    {
//        MB = (kiloBytes / 1024);
//        remainder = (kiloBytes % 1024);
//
//        System.out.print(kiloBytes+ " KB = "+MB+ " MB and "+remainder+ " KB ");
//
//    }
//}
//}
//

    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            barking = false;
        } else if (((hourOfDay < 8) || (hourOfDay > 22)) && barking) {
            barking = true;
        } else {
            barking = false;
        }
        return barking;
    }
}*/

    public static void main(String args[]) {
       int newScore = calculateScore( "vineeth" , 50);
        System.out.println("corrected score is " + newScore);
    }
        public static int calculateScore (String playerName, int score){
            System.out.println("player " + playerName + "'s score is " + score);
            return score *100;
        }

    }
