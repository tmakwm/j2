package com.j2.state.newcase;

public class VideoPlayer{
  State offState;
  State onState;
  State playState;
  State stopState;
  State state;
  VideoPlayer(){
   offState = new OffState(this); 
   onState = new OnState(this); 
   stopState = new StopState(this); 
   playState = new PlayState(this); 
   state = offState;
  }
  public State getState(){
    return state;
  }
  public void setState(State state){
    this.state = state;
  }
  public State getOffState(){
    return offState;
  }
  public State getOnState(){
    return onState;
  }
  public State getStopState(){
    return stopState;
  }
  public State getPlayState(){
    return playState;
  }
  public void play(){
    state.play();
  }
  
  public void stop(){
    state.stop();
  }
  public void on(){
    state.on();
  }
  public void off(){
    state.off();
  }
}