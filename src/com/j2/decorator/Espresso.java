package com.j2.decorator;

public class Espresso extends Beverage{
  public Espresso(){
    description = "Espresso Coffee";
  }
  public double cost(){
    return 0.99;
  }
}