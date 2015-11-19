package com.j2.templatemethod.caseextension;

public class Barista{
  public static void main(String args[]){
    Coffee coffee = new Coffee();
    coffee.prepareRecipie();
    CoffeeWithHook cowithH = new CoffeeWithHook();
    cowithH.prepareRecipie();
    CaramelMacchiato cm = new CaramelMacchiato();
    cm.prepareRecipie();
  }
}