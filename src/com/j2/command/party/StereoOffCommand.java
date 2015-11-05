package com.j2.command.party;

public class StereoOffCommand implements Command{
 Stereo stereo;
 
 public StereoOffCommand(Stereo stereo) {
  this.stereo = stereo;
 }
 
 public void execute() {
  stereo.StereoOff();
 }

 public void undo() {
  stereo.StereoOn();
 }
}