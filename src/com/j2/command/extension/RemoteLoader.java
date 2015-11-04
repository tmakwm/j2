package com.j2.command.extension;

public class RemoteLoader{
  public static void main(String args[]){
    
    RemoteControlWithUndo remotecontrol = new RemoteControlWithUndo();    
    Light livingRoomLight = new Light("living Room");
    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight); 
    
    remotecontrol.setCommand(0,livingRoomLightOn, livingRoomLightOff);
    remotecontrol.onButonWasPushed(0);
    remotecontrol.offButonWasPushed(0);
    
    
    DVD dvd = new DVD();
    MovieStartCommand movieon = new MovieStartCommand(dvd);
    MovieEndCommand moviequit = new MovieEndCommand(dvd);
    remotecontrol.setCommand(1,movieon,moviequit);
    remotecontrol.onButonWasPushed(1);
    remotecontrol.offButonWasPushed(1);
  }
}