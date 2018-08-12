package com.vinz;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (this.tonerLevel > -1 && this.tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
            System.out.println("Toner Level is ok for now and is " + tonerLevel);

        }else{
            this.tonerLevel = -1;
        }
        //this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel+tonerAmount>100){
                return -1;
            }
            this.tonerLevel+=tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;

        }
    }
    public int  printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint =((pages/2)+(pages%2)) ;
            System.out.println("printing in duplex mode");
        }
        this.pagesPrinted+=pagesToPrint;
        return pagesToPrint;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}


