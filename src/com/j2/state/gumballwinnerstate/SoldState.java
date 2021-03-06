package com.j2.state.gumballwinnerstate;

public class SoldState implements State{
  GumballMachine gm;
  public SoldState(GumballMachine gm){
    this.gm = gm;
  }
  public void insertQuarter(){
    System.out.println("wait we'ere already giving you a gumball");      
  }
   public void ejectQuarter(){    
    System.out.println("sorry you already turned the crank");
    gm.setState(gm.getNoQuarterState());    
  }
   public void turnCrank(){
    System.out.println("turning twice doesn't get you another gumball");
    gm.setState(gm.getSoldState());
  }   
   public void dispense(){    
      System.out.println("gumball dispensed");
      if(gm.getCount() >0){
        gm.setState(gm.getNoQuarterState());
      }
      else{
        System.out.println("sold out");
        gm.setState(gm.getSoldOutState());
      }
  }
   public String toString(){
     return "waiting for turn of crank";
   }
}