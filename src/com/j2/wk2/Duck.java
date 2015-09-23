package com.j2.wk2;
public abstract class Duck {
  public Duck(){
  }
  public FlyBehavior flyBehavior;
  public QuackBehavior quackBehavior;
  public void swim(){
    System.out.println("all duck float, even decoys!:");
  }
  public abstract void display();
  public void performQuack(){
      quackBehavior.Quack();
  }
  public void performFly(){
    flyBehavior.fly();
  }
  public void setFlyBehavior(FlyBehavior fb){
    flyBehavior = fb;
  }
  public void setQuackBehavior(QuackBehavior qb){
    quackBehavior = qb;
  }
}