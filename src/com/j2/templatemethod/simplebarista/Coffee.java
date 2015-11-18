package com.j2.templatemethod.simplebarista;

public class Coffee{
  public void prepareRecipie(){
   boilWater();
   brewCoffeeGrinds();
   pourInCup();
   addSugarAndMilk();
  }
  public void boilWater(){
    System.out.println("boiling");
  }
  public void brewCoffeeGrinds(){
    System.out.println("dripping");
  }
  public void pourInCup(){
    System.out.println("pouring");
  }
  public void addSugarAndMilk(){
    System.out.println("adding sugar + milk");
  }
}