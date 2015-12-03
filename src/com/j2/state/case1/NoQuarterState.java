package com.j2.state.case1;

public class NoQuarterState implements State{
  GumballMachine gm;
  public NoQuarterState(GumballMachine gm){
    this.gm = gm;
  }
  public void error(){
   }
  public void insertQuarter(){
    System.out.println("YOU INSERT QUARTER"); 
    gm.setState(gm.getHasQuarterState());
  }
   public void ejectQuarter(){    
    System.out.println("YOU HAVEN'T INSERTED QUARTER");  
        gm.setState(gm.getErrorState());
  }
   public void turnCrank(){
    System.out.println("you turned but no QUARTER");
        gm.setState(gm.getErrorState());
  }   
   public void dispense(){    
      System.out.println("Pay first");
          gm.setState(gm.getErrorState());
  }
   public String toString(){
     return "waiting for insert quarter";
   }
}