package com.j2.templatemethod.barista;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
  public void brew(){
    System.out.println("dripping");
  }
  public void addCondiments(){
    System.out.println("adding sugar + milk");
  }
  public boolean customerWantsCondiments(){
    String answer = "Yes";
    if(answer.toLowerCase().startsWith("y")){
      return true;
    }
    else{
      return false;
  }
}
}