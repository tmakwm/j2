package com.j2.decorator;

public class HouseBlend extends Beverage{
  public HouseBlend(){
    description = "House Blend Coffe";
  }
  public double cost(){
    return .99;
  }
}