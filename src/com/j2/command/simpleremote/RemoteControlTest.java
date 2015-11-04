package com.j2.command.simpleremote;

public class RemoteControlTest{
  public static void main(String args[]){
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();
    LightOnCommand lighton= new LightOnCommand(light);
    remote.setCommand(lighton);
    remote.buttonWasPressed();
    Garage garage = new Garage();
    GarageOnCommand garageopen = new GarageOnCommand(garage);
    remote.setCommand(garageopen);
    remote.buttonWasPressed();
  }
}
    