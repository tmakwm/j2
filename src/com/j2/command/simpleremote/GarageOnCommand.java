package com.j2.command.simpleremote;

public class GarageOnCommand implements Command{
  Garage garage;
  public GarageOnCommand(Garage garage){
    this.garage = garage;
  }
  public void execute(){
    garage.DoorOpen();
  }
}