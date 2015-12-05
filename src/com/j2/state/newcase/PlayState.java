package com.j2.state.newcase;

public class PlayState implements State{
  VideoPlayer vp;
  public PlayState(VideoPlayer vod){
    vp = vod;
  }
  public void play(){
    System.out.println("Already Playing");
  }
  public void stop(){
    System.out.println("Stop Playing Video");
    vp.setState(vp.getStopState());
  }
  public void on(){
    System.out.println("Display is already turn on");
  }
  public void off(){
    System.out.println("During Playing Video you can't turn off!!!");
  }
}