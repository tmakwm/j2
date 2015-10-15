package com.j2.factory.pizzaaf;

public class SMPizzaStore extends PizzaStore{
    
  public Pizza createPizza(String item) {
  Pizza pizza = null;
  PizzaIngredientFactory ingredientFactory =  new SMPizzaIngredientFactory();

  if (item.equals("cheese")) {
   pizza = new CheesePizza(ingredientFactory);
   pizza.setName("SM Style Cheese Pizza");
  }
   else if(item.equals("potato")){
   pizza = new PotatoPizza(ingredientFactory);
   pizza.setName("SM Style Potato Pizza" );
  }
  return pizza;
 }
}
