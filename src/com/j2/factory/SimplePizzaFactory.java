package com.j2.factory;

public class SimplePizzaFactory{
  public Pizza createPizza(String type){//�Լ� ������ Pizza��ü �����Ƿ� ���� ����
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