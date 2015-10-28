package com.j2.singleton.subclass;
public class SingletonMain{
  public static void main(String[]args){
    Singleton s1 = HotterSingleton.getInstance();
    Singleton s2 = CoolerSingleton.getInstance();
    System.out.println(s1);
    System.out.println(s2);
  }
}