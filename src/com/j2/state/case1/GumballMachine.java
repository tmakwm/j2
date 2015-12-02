package com.j2.state.case1;

public class GumballMachine{
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State state;
  int count =0;
  public GumballMachine(int n){
    this.count = n;
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    if(n > 0){
      state = noQuarterState;
    }
    else{
      state = soldOutState;
    }
  }
  public int getCount(){
    return count;
  }
  public void setCount(int count){
   this.count = count; 
  }
  public void setState(State state){
   this.state = state; 
  }
  public State getState(){
   return this.state; 
  }  
  public State getSoldOutState(){
   return this.soldOutState; 
  }  
  public State getNoQuarterState(){
   return this.noQuarterState; 
  }
  public State getSoldState(){
   return this.soldState; 
  }  
  public State getHasQuarterState(){
   return this.hasQuarterState; 
  }
  public void insertQuarter(){
    state.insertQuarter();
  }
  public void ejectQuarter(){
    state.ejectQuarter();
  }
  public void turnCrank(){
    state.turnCrank();
  }
  public void dispense(){
    state.dispense();
  }  
  }
