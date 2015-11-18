package com.j2.templatemethod.barista;

public class Coffee extends CaffeineBeverage{
  public void brew(){
    System.out.println("dripping");
  }
  public void addCondiments(){
    System.out.println("adding sugar + milk");
  }
}