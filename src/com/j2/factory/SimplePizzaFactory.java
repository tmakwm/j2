package com.j2.factory;

public class SimplePizzaFactory{
  public Pizza createPizza(String type){//함수 내에서 Pizza객체 가지므로 약한 관계
    Pizza pizza = null;
    if(type.equals("cheese")){
      pizza = new CheesePizza();
    }
    else if(type.equals("potato")){
      pizza = new PotatoPizza();
    }
    return pizza;
   }
 }