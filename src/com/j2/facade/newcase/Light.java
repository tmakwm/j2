package com.j2.facade.newcase;

public class Light{
  String description;
  public Light(String description){
    this.description = description;
  }
  public void lightOn(){
    System.out.println(description + " light is on");
  }
  public void lightOff(){
    System.out.println(description + " light is off");
  }
  public String toString(){
    return description;
  }
}