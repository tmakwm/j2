package com.j2.facade.newcase;

public class TestDrive{
  public static void main(String args[]){
    Door door = new Door("my study room");
    Light light=new Light("my study room");
    
    Tuner tuner= new Tuner("my am/fm tuner");
    Radio radio=new Radio("my radio",tuner);
    SmartHome smart = new SmartHome(door,light,radio,tuner);
    smart.beginStudy();
    smart.endStudy();
  }
}