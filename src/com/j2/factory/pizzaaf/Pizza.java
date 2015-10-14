package com.j2.factory.pizzaaf;

public abstract class Pizza{
   String name;
  void prepare();
   void bake(){
    System.out.println("baking...");
  }
   void cut(){
    System.out.println("cutting...");
  }
   void box(){
    System.out.println("boxing...");
  }
   public String getName(){
     return name;
  }
   public String toString(){
     System.out.println("----" + name + "-----");
     return name;
   }
}
