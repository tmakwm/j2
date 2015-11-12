package com.j2.facade.newcase;

public class Tuner{
  String description;

  public Tuner(String description){
    this.description = description;

  }
  public void tuneron(){
    System.out.println(description + " tuner on");
  }
  public void setFrequency(){
   System.out.println( description  + " set to fm");
  }
  public String toString(){
    return description;
  }
}
    