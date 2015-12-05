package com.j2.state.newcase;

public class OnState implements State{
  VideoPlayer vp;
  public OnState(VideoPlayer vod){
    vp = vod;
  }
 public  void play(){
    System.out.println("Now Playing VIDEO ");
    vp.setState(vp.getPlayState());
  }
  public void stop(){
    System.out.println("There's no Playing VIDEO ");
  }
  public void on(){
    System.out.println("Display is already on");
  }
  public void off(){
    System.out.println("Turn off the Display");
    vp.setState(vp.getOffState());
  }
}