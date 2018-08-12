package com.vinz;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber; //required fields, next step create getters and setters

    public Account(){
        this("1234567",125.0,"default name","default email","default phone"); // if cosntrucotr without parametersis invoked.
                                                                        //these will be the default values assigned to them.
                // this must be first line of the code orelse error will be displayed
        System.out.println("new constructor intialized");//intialize the object we are creating and do whatever(about consstrucotr)
        //we are willing to do at the time of object creation(about constructor)
    }
    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("constructor with parameter invoked");
        this.number= number;
        this.balance= balance;
        this.customerName= customerName;
        this.customerEmailAddress=customerEmailAddress;
        this.customerPhoneNumber=customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("deposit made is "+ depositAmount+ "  new balance is "+this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance>= withdrawalAmount){
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal of "+withdrawalAmount+ " new account blanace is "+this.balance);

        }else{
            System.out.println("balance is "+this.balance +"  which is insufficient to make this transaction");
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
