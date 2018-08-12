package com.vinz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        isLeapYear(200);
        System.out.println("this year is leap year " +isLeapYear(1600));
        getDaysInMonth(2, 2008);
        System.out.println("no of days = " +getDaysInMonth(2,1600));
    }

    /* switchChar();
   }
   public static void switchChar() {
       char x;
       Scanner scan = new Scanner(System.in);
       System.out.println("give value for x");
       x = scan.next().charAt(0);
       switch (x) {
           case 'A':
               System.out.println(" this is 1");
               break;
           case 'B':
               System.out.println("this is 2");
               break;
           case 'C': case 'D': case 'E':
               System.out.println("3 or 4 or 5");
               break;
           default:
               System.out.println("neither");
       }
   }
*/
    public static boolean isLeapYear(int year) {
        if ((year < 1 || year > 9999)) {
            return false;
        }
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    //Days In Month Method
    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || ((year < 1 || year > 9999))) {
            return -1;
        }
        switch (month) { // months that have 31
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;

            case 2: //test Feb to see if it's a leap year or not
                if (isLeapYear(year)) { // if it's leap year return 29
                    return 29;
                } else {
                    return 28; // if it's not leap year return 28
                }
            case 4: case 6: case 9: case 11: //Months that have 30 days
                return 30;
            default:
                return -1; //default return
        }
    }

}