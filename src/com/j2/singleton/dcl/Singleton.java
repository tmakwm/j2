package com.j2.singleton.dcl;

public class Singleton{
  private volatile static Singleton uniqueInstance = new Singleton();
  private static int numCalled; 
  
  public static Singleton getInstance(){
    if(uniqueInstance == null){
      synchronized(Singleton.class){
        if(uniqueInstance ==null){
          uniqueInstance = new Singleton();
        }
      }
    }
    System.out.println("numcalled: " +numCalled++);
    return uniqueInstance;
  }
}