package com.j2.command.extension;

public class LightOffCommand implements Command{
   Light light;
  int level;
  public LightOffCommand(Light light){
    this.light = light;
  }
  public void execute(){
    level = light.getLevel();
    light.Off();
  }
  public void undo(){
    light.dim(level);
  }
}
                      