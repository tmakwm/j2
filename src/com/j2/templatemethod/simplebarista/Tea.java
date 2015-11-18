package com.j2.templatemethod.simplebarista;

public class Tea{
  public void prepareRecipie(){
   boilWater();
   steepTeaBag();
   pourInCup();
   addLemon();
  }
  public void boilWater(){
    System.out.println("boiling");
  }
  public void steepTeaBag(){
    System.out.println("steeping");
  }
  public void pourInCup(){
    System.out.println("pouring");
  }
  public void addLemon(){
    System.out.println("adding lemon");
  }
}