package com.j2.singleton.printer;

public class PrinterSpoolerMain{
  public static void main(String[]args){
    PrinterSpooler s1 = PrinterSpooler.getInstance();
    s1.print();
    PrinterSpooler s2 = PrinterSpooler.getInstance();
    s2.print();
    PrinterSpooler s3 = PrinterSpooler.getInstance();
    s3.print();
  }
}