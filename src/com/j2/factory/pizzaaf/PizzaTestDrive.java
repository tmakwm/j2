package com.j2.factory.pizzaaf;

public class PizzaTestDrive {
 
 public static void main(String[] args) {
  PizzaStore nyStore = new NYPizzaStore();
  PizzaStore chicagoStore = new ChicagoPizzaStore();
 PizzaStore SMStore = new SMPizzaStore();
  Pizza pizza = nyStore.orderPizza("cheese");
  System.out.println("Ethan ordered a " + pizza + "\n");
 
  pizza = chicagoStore.orderPizza("cheese");
  System.out.println("Joel ordered a " + pizza + "\n");

  pizza = nyStore.orderPizza("potato");
  System.out.println("Ethan ordered a " + pizza + "\n");
 
  pizza = chicagoStore.orderPizza("potato");
  System.out.println("Joel ordered a " + pizza + "\n");
  
  pizza = SMStore.orderPizza("cheese");
  System.out.println("Seung orderd a" + pizza + "\n");
   
  pizza = SMStore.orderPizza("potato");
  System.out.println("Seung orderd a" + pizza + "\n" );
 }
}
