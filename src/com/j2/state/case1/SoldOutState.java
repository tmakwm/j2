package com.j2.state.case1;

public class SoldOutState implements State{
  GumballMachine gm;
  public SoldOutState(GumballMachine gm){
    this.gm = gm;
  }
  public void error(){
   }
  public void insertQuarter(){
    System.out.println("sold out refill");      
  }
   public void ejectQuarter(){    
    System.out.println("you can't eject insert quarter first");    
  }
   public void turnCrank(){
    System.out.println("you turned but there are no quarter");
    
  }   
   public void dispense(){    
      System.out.println("no gumball dispensed");
  }
   public String toString(){
     return "sold out please refill";
   }
}