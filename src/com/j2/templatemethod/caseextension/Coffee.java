package com.j2.templatemethod.caseextension;

public class Coffee extends CaffeineBeverage{
  public void brew(){
    System.out.println("dripping");
  }
  public void addCondiments(){
    System.out.println("adding sugar + milk");
  }
}