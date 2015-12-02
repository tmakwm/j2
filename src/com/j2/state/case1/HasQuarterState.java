package com.j2.state.case1;

public class HasQuarterState implements State{
  GumballMachine gm;
  public HasQuarterState(GumballMachine gm){
    this.gm = gm;
  }
  public void error(){
   }
  public void insertQuarter(){
    System.out.println("YOU CAN NOT INSERT ANOTHER QUARTER");      
  }
   public void ejectQuarter(){    
    System.out.println("Quarter returned");
    gm.setState(gm.getNoQuarterState());    
  }
   public void turnCrank(){
    System.out.println("you turned");
    gm.setState(gm.getSoldState());
  }   
   public void dispense(){    
      System.out.println("no gumball dispensed");
  }
   
   public String toString(){
     return "waiting for turn of crank";
   }
}