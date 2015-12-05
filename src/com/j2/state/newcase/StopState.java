package com.j2.state.newcase;

public class StopState implements State{
  VideoPlayer vp;
  public StopState(VideoPlayer vod){
    vp = vod;
  }
  public void play(){
    System.out.println("Playing another Video");
  }
  public void stop(){
    System.out.println("Video is stopped already");
  }
  public void on(){
    System.out.println("Player is turn on ");
  }
  public void off(){
    System.out.println("Turning off Display");
    vp.setState(vp.getOffState());
  }
}