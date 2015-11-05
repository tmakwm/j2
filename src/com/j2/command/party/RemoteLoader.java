package com.j2.command.party;

public class RemoteLoader{
  public static void main(String args[]){
    RemoteControlWithUndo remotecontrol = new RemoteControlWithUndo();
    
    Light livingRoomLight = new Light("living Room");
    TV tv = new TV("Living Room");
    Stereo stereo = new Stereo("Living Room");
    Hottub hottub = new Hottub();
    
    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight); 
    TVOnCommand tvOn = new TVOnCommand(tv);
    TVOffCommand tvOff = new TVOffCommand(tv);
    HottubOnCommand hottubOn = new HottubOnCommand(hottub);
    HottubOffCommand hottubOff = new HottubOffCommand(hottub);
    StereoOnCommand stereoOn = new StereoOnCommand(stereo);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);
    
    Command[] partyOn = {livingRoomLightOn, stereoOn, tvOn, hottubOn};
    Command[] partyOff = {livingRoomLightOff , stereoOff, tvOff, hottubOff};
    
    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);
    
    remotecontrol.setCommand(0, partyOnMacro, partyOffMacro);
    
    System.out.println(remotecontrol);
    System.out.println("---pushing Macro on---");
    remotecontrol.onButtonWasPushed(0);
    System.out.println("---Pushing Macro Off---");
    remotecontrol.offButtonWasPushed(0);
  }
}