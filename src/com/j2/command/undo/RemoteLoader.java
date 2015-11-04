package com.j2.command.undo;

public class RemoteLoader{
  public static void main(String args[]){
    RemoteControlWithUndo remotecontrol = new RemoteControlWithUndo();
    
    Light livingRoomLight = new Light("living Room");
    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight); 
    remotecontrol.setCommand(0,livingRoomLightOn, livingRoomLightOff);
    remotecontrol.onButonWasPushed(0);
    remotecontrol.offButonWasPushed(0);
    System.out.println(remotecontrol);
  }
}