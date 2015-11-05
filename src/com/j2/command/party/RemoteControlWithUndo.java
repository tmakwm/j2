package com.j2.command.party;

class RemoteControlWithUndo{
Command onCommands[];
Command offCommands[];
Command undoCommand;

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
public void onButtonWasPushed(int slot){
  onCommands[slot].execute();
  undoCommand = onCommands[slot];
}
public void offButtonWasPushed(int slot){
  offCommands[slot].execute();
  undoCommand = offCommands[slot];
}
public void undoButtonWasPushed(){
  undoCommand.undo();
}
public String toString(){
  StringBuffer stringbuff = new StringBuffer();
  stringbuff.append("\n-----Remote Control----\n");
  for(int i=0;i < onCommands.length; i++){
    stringbuff.append("slot["+i+"]" + onCommands[i].getClass().getName() +"\n"+
                      offCommands[i].getClass().getName() + "\n");
  }
   return stringbuff.toString();
}
}
