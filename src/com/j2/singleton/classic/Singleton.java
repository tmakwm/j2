package com.j2.singleton.classic;

public class Singleton
{
  private boolean empty;
  private boolean boiled;
  private static int numCalled;
  private static Singleton uniqueInstance;
  private Singleton(){
  }
  public static Singleton getInstance(){
    if(uniqueInstance == null){
      System.out.println("CREATING NEW INSTANCE");
      uniqueInstance = new Singleton();
    }
    System.out.println("numcalled: "+ numCalled++);
    return uniqueInstance;
  }
  public void fill(){
    if(isEmpty()){
      empty = false;
      boiled = false;
    }
  }
  public boolean isEmpty(){
    return empty;
  }
}