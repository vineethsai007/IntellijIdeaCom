package com.vinz;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account bobsAccount = new Account();//("acd12345",2345.0,"Bob Johnson","myemail@xyzzz.com","320-344-4563");
        //instantiate with constructor parameters all the above fields are set;
        System.out.println(bobsAccount.getBalance());// checking parameters passed by constructor, instead of using setters;
        bobsAccount.withdrawal(100.0);

    }
}
