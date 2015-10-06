package com.j2.decorator;

public abstract class Beverage{
  String description = "Unkown beverage";
  public String getDescription(){
    return description;
  }
  public abstract double cost();
}