package com.j2.state.case1;

public class GumballMachineTestDrive{
  public static void main(String[] args){
    GumballMachine gm=new GumballMachine(5);
   
    gm.insertQuarter();
    gm.turnCrank();
    gm.dispense();
     gm.insertQuarter();
    gm.turnCrank();
    gm.dispense();
     gm.insertQuarter();
    gm.turnCrank();
    gm.dispense();
     gm.insertQuarter();
     gm.ejectQuarter();
    gm.turnCrank();
    gm.dispense();
    gm.insertQuarter();
    gm.turnCrank();
    gm.dispense();
    gm.insertQuarter();
    gm.turnCrank();
    gm.dispense();
    gm.insertQuarter();
    gm.turnCrank();
    gm.dispense();
  }
}