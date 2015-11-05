package com.j2.command.party;

public class StereoOnCommand implements Command{
  Stereo stereo;

 public StereoOnCommand(Stereo stereo) {
  this.stereo = stereo;
 }

 public void execute() {
  stereo.StereoOn();
 }

 public void undo() {
  stereo.StereoOff();
 }
}