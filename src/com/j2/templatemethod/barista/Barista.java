package com.j2.templatemethod.barista;

public class Barista{
  public static void main(String args[]){
    Coffee coffee = new Coffee();
    coffee.prepareRecipie();
    CoffeeWithHook cowithH = new CoffeeWithHook();
    cowithH.prepareRecipie();
  }
}