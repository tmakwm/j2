package com.j2.state.gumballwinnerstate;

public interface State{
  public void insertQuarter();
  public void ejectQuarter();
  public void turnCrank();
  public void dispense();
}