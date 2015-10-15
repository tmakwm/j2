package com.j2.factory.pizzaaf;

public class CheesePizza extends Pizza{
  PizzaIngredientFactory ingredientFactory;
  public CheesePizza(PizzaIngredientFactory ingredientFactory){
    this.ingredientFactory = ingredientFactory;
    name = "Cheese Pizza";
  }
  public void prepare(){
    System.out.println("preparing" +name );
    Dough dough = ingredientFactory.createDough();
    Cheese cheese = ingredientFactory.createCheese();
    description = dough.toString()+", "+cheese.toString();
  }

}
  
    