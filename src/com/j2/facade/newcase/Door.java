package com.j2.facade.newcase;

public class Door{
  String description;
  public Door(String description){
    this.description = description;
  }
  public void close(){
    System.out.println(description + " Door closed");
  }
  public void open(){
    System.out.println(description + " Door open");
  }
  public String toString(){
    return description;
  }
}