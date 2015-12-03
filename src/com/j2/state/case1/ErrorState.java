package com.j2.state.case1;
public class ErrorState implements State{
  GumballMachine gm;
  public ErrorState(GumballMachine gm){
    this.gm = gm;
  }
  public void error(){
   }
  public void insertQuarter(){
    System.out.println("ERROR STATE ");      
    gm.setState(gm.getPrevState());
  }
   public void ejectQuarter(){    
    System.out.println("ERROR STATE");
    gm.setState(gm.getPrevState());
  }
   public void turnCrank(){
    System.out.println("ERROR STATE");
    gm.setState(gm.getPrevState());
  }   
   public void dispense(){    
      System.out.println("ERROR STATE");
      gm.setState(gm.getPrevState());
  }
   public String toString(){
     return "ERROR ERROR CALL ENGINEER";
   }
}