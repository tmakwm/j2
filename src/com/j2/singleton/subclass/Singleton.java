package com.j2.singleton.subclass;

public class Singleton{
  protected static Singleton uniqueInstance;
  private static int numCalled; 
  protected Singleton(){}
  public static synchronized Singleton getInstance(){
    if(uniqueInstance ==null){
     uniqueInstance = new Singleton(); 
    }
    System.out.println("numcalled: " +numCalled++);
    return uniqueInstance;
  }
}