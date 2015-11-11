package com.j2.adapter.ducks;

public class TurkeyAdapter implements Duck{
  Turkey turkey;
  public TurkeyAdapter(Turkey turkey){
    this.turkey = turkey;
  }
  public void quack(){
    turkey.gobble();
        turkey.gobble();
  }
  public void fly(){
    turkey.fly();
  }
}