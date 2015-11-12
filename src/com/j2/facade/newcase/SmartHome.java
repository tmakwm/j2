package com.j2.facade.newcase;

public class SmartHome{
  private Door door;
  private Light light;
  private Radio radio;
  private Tuner tuner;
  public SmartHome(Door door, Light light, Radio radio, Tuner tuner){
    this.door= door;
    this.light = light;
    this.radio = radio;
    this.tuner = tuner;
}
  public void beginStudy(){
    door.close();
    light.lightOn();
    radio.on();
    tuner.setFrequency();
  }
  public void endStudy(){
   door.open();
   light.lightOff();
   radio.off();
  }
}