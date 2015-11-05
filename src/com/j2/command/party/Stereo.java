package com.j2.command.party;

public class Stereo{
  String location;

 public Stereo(String location) {
  this.location = location;
 }
  public void StereoOn(){
    System.out.println("stereo on");
  }
  public void StereoOff(){
    System.out.println("stereo off");
  }
}