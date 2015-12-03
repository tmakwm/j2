package com.j2.state.gumballwinnerstate;
import java.util.Random;;

public class HasQuarterState implements State{
  GumballMachine gm;
  Random randomWinner = new Random(System.currentTimeMillis());
  public HasQuarterState(GumballMachine gm){
    this.gm = gm;
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
    int winner = randomWinner.nextInt(10);
    if((winner ==0) && (gm.getCount()>1)){
      gm.setState(gm.getWinnerState());
    }
    else{
      gm.setState(gm.getSoldState());
      }
  }   

   public void dispense(){    
      System.out.println("no gumball dispensed");
  }
   public String toString(){
     return "waiting for turn of crank";
   }
}