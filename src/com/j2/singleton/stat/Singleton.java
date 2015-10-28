package com.j2.singleton.stat;

public class Singleton
{
  private static Singleton uniqueInstance = new Singleton();
  private static int numCalled=0;
  private Singleton(){}
  public static Singleton getInstance(){
    System.out.println("numo of called: " +numCalled++);
    return uniqueInstance;
  }
}