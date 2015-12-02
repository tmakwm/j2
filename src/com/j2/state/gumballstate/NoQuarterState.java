package com.j2.state.gumballstate;

public class NoQuarterState implements State{
  GumballMachine gm;
  public NoQuarterState(GumballMachine gm){
    this.gm = gm;
  }
  public void insertQuarter(){
    System.out.println("YOU INSERT QUARTER"); 
    gm.setState(gm.getHasQuarterState());
  }
   public void ejectQuarter(){    
    System.out.println("YOU HAVEN'T INSERTED QUARTER");  
  }
   public void turnCrank(){
    System.out.println("you turned but no QUARTER");
  }   
   public void dispense(){    
      System.out.println("Pay first");
  }
   public String toString(){
     return "waiting for insert quarter";
   }
}