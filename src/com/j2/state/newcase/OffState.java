package com.j2.state.newcase;

public class OffState implements State{
  VideoPlayer vp;
  public OffState(VideoPlayer vod){
    vp = vod;
  }
  public void play(){
    System.out.println("Display is off ");
  }
  public void stop(){
    System.out.println("Display is off ");
  }
  public void on(){
    System.out.println("Display is now starting");
    vp.setState(vp.getOnState());
  }
  public void off(){
        System.out.println("Display is Already off ");
  }
}