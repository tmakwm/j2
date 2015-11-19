package com.j2.templatemethod.caseextension;

public abstract class CaffeineBeverage{
  public final void prepareRecipie(){
   boilWater();
   brew();
   pourInCup();
   addCondiments();
  }
  public void boilWater(){
    System.out.println("boiling water");
  }
  abstract void brew();
  
  public void pourInCup(){
    System.out.println("pouring drink");
  }
  abstract void addCondiments();
}