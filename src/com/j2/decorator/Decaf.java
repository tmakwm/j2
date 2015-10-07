package com.j2.decorator;
public class Decaf extends Beverage{
  public Decaf(){
    description = "Decaf coffee";
  }
  public double cost(){
    return 0.88;
  }
}