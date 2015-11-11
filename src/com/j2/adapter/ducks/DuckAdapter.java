package com.j2.adapter.ducks;

public class DuckAdapter implements Turkey{
  Duck duck;
  public DuckAdapter(Duck duck){
   this.duck = duck; 
  }
  public void gobble(){
    duck.quack();
        duck.quack();
  }
  public void fly(){
    duck.fly();
  }
}