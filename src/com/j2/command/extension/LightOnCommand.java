package com.j2.command.extension;

public class LightOnCommand implements Command{
  Light light;
  int level;
  public LightOnCommand(Light light){
    this.light = light;
  }
  public void execute(){
    level = light.getLevel();
    light.On();
  }
  public void undo(){
    light.dim(level);
  }
}
                      