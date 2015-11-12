package com.j2.facade.newcase;

public class Radio{
  String description;
  Tuner tuner;

  public Radio(String description, Tuner tuner){
    this.description = description;
    this.tuner = tuner;
  }
  public void on(){
   System.out.println( description + "  on");
  }
    public void off(){
   System.out.println( description + "  off");
  }
  public String toString(){
    return description;
  }
}