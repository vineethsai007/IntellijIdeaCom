package com.vinz;
import  java.util.Scanner ;
public class Main {

    public static void main(String[] args) {
        switchExample();
    }
        public static void switchExample() {
            int x;
        Scanner scan = new Scanner(System.in);
            System.out.println("give value for x");
            x = scan.nextInt();
            switch (x) {
                case 1:
                    System.out.println(" this is 1");
                    break;
                case 2:
                    System.out.println("this is 2");
                    break;
                case 3: case 4: case 5:
                    System.out.println("3 or 4 or 5");
                    break;
                default:
                    System.out.println("neither");
        }
    }

}
