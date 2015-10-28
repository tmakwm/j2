package com.j2.singleton.classic;
public class SingletonMain{
  public static void main(String[]args){
    Singleton s1 = Singleton.getinstance();
    Singleton s2 = Singleton.getinstance();
  }
}