package com.j2.command.undo;

public class Light{
  int level;
  String location;
  public Light(String location){
    this.location = location;
  }
  public void On(){
    level = 100;
    System.out.println("Light is on");
  }
  public void Off(){
    level =0;
    System.out.println("Light is off");
  }
  public void dim(int level){
    this.level = level;
    if(level == 0){
      Off();
    }
    else{
      System.out.println("Light is dimmed to " +level);
    }
  }
  public int getLevel(){
    return level;
  }
}