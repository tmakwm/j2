package com.j2.adapter.ducks;

public class DuckTest{
  public static void main(String args[]){
    MallardDuck duck = new MallardDuck();
    WildTurkey turkey = new WildTurkey();
    TurkeyAdapter turkeyadapter = new TurkeyAdapter(turkey);
    DuckAdapter duckadapter = new DuckAdapter(duck);
    System.out.println("turkey says");
    turkey.gobble();
    turkey.fly();
    System.out.println("turkey adapter says");
    turkeyadapter.quack();
    turkeyadapter.fly();
     System.out.println("duck says");
    duck.quack();
    duck.fly();
    System.out.println("duck adapter says");
    duckadapter.gobble();
    duckadapter.fly();
}
}