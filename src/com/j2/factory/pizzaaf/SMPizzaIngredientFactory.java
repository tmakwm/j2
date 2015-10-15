package com.j2.factory.pizzaaf;

public class SMPizzaIngredientFactory implements PizzaIngredientFactory {
 
 public Dough createDough() {
  return new SMCrustDough();
 }

 public Cheese createCheese() {
  return new SMCheese();
 }
 
 public Potato createPotato(){
   return new mashedPotato();
 }
}
