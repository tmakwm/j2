package com.j2.decorator;
public class Whip extends CondimentDecorator{
  Beverage beverage;
  public Whip(Beverage beverage){
    this.beverage = beverage;
  }
  public String getDescription(){
    return (beverage.getDescription() + ", with Whip");
  }
  public double cost(){
    return (beverage.cost() + 0.11);
  }
}