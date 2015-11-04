package com.j2.command.extension;

class RemoteControlWithUndo{
Command onCommands[];
Command offCommands[];
Command noCommand = new NoCommand();

public RemoteControlWithUndo(){
  Command noCommand = new NoCommand();
 onCommands = new Command[7];
 offCommands = new Command[7];
 for(int i=0; i<7;i++){
   onCommands[i] = noCommand;
   offCommands[i] = noCommand;
 }
}


public void  setCommand(int slot, Command on, Command off){
  onCommands[slot] = on;
  offCommands[slot] = off;
}


public void onButonWasPushed(int slot){
  onCommands[slot].execute();
}


public void offButonWasPushed(int slot){
  offCommands[slot].execute();
}


}
