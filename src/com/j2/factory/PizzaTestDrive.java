package com.j2.factory;

public class PizzaTestDrive{
  public static void main(String args[]){
   SimplePizzaFactory factory = new SimplePizzaFactory();
   PizzaStore store = new PizzaStore(factory);
   Pizza pizza = store.orderPizza("cheese");
   System.out.println("We ordered a " + pizza.getName());
   Pizza pizza2 = store.orderPizza("potato");
   System.out.println("We ordered a " + pizza2.getName());
  }   
    
  }