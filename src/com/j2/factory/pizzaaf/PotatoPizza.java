package com.j2.factory.pizzaaf;

public class PotatoPizza extends Pizza{
  PizzaIngredientFactory ingredientfactory;
   public PotatoPizza(PizzaIngredientFactory ingredientfactory){
    this.ingredientfactory = ingredientfactory;
    name = "Potato Pizza";
   }
  public void prepare(){
    System.out.println("preparing" +name );
    Dough dough = ingredientfactory.createDough();
    Potato potato = ingredientfactory.createPotato();
    description = dough.toString()+", "+potato.toString();
  }
 }