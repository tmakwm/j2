package com.j2.state.gumball;

public class GumballMachineTestDrive{
  public static void main(String[] args){
    GumballMachine gm=new GumballMachine(5);
    gm.insertQuarter();
   gm.ejectQuarter();
  }
}
