package com.j2.state.newcase;

public class TestDrive{
  public static void main(String args[]){
    VideoPlayer vp = new VideoPlayer();
    vp.on();
    vp.play();
    vp.stop();
    vp.off();
    
    vp.play();
    
     vp.on();
    vp.play();
    vp.off();
    vp.play();
    vp.stop();
    vp.stop();
    vp.off();
    vp.off();
  }
}