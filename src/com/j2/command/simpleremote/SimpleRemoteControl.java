package com.j2.command.simpleremote;

public class SimpleRemoteControl{
  Command slot;
  public void setCommand(Command command){
    slot = command;
  }
  public void buttonWasPressed(){
    slot.execute();
  }
  public SimpleRemoteControl(){
  }
}