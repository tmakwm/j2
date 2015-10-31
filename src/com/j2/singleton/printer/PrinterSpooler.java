package com.j2.singleton.printer;

public class PrinterSpooler{
  private static PrinterSpooler uniqueInstance ;
  private static int numCalled;
  private boolean empty;
  
  public static synchronized PrinterSpooler getInstance(){
    if(uniqueInstance == null){
      System.out.println("CREATING NEW INSTANCE");
      uniqueInstance = new PrinterSpooler();
    }
    System.out.println("numcalled: " + numCalled++);
    return uniqueInstance;
  }
  public void print(){
   if(isEmpty()){
      empty = false;
   }
   System.out.println("printing...");
  }
  public boolean isEmpty(){
    return empty;
  }
}