package com.j2.factory.pizzaaf;

public abstract class Pizza{
   String name;
   String description;
   public void prepare(){
     System.out.println("preparing...");
   }
   void bake(){
    System.out.println("baking...");
  }
  public void cut(){
    System.out.println("cutting...");
  }
   public void box(){
    System.out.println("boxing...");
  }
   public String getName(){
     return name;
  }
  public void setName(String name){
    this.name = name;
  }

   public String toString(){
     System.out.println("----" + name + "-----");
     System.out.println(description);
     return name;
   }
   
}
