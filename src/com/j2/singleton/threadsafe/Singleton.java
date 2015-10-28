package com.j2.singleton.threadsafe;

public class Singleton{
  private static Singleton uniqueInstance = new Singleton();
 private static int numCalled; 
  public static synchronized Singleton getInstance(){
    System.out.println("numcalled: " +numCalled++);
    return uniqueInstance;
  }
}