package com.j2.state.gumball;

public class GumballMachine{
  final static int SOLD_OUT =0;
  final static int NO_QUARTER = 1;
  final static int HAS_QUARTER = 2;
  final static int SOLD =3;
  int state = SOLD_OUT;
  int count =0;
  public GumballMachine(int count ){
    this.count = count;
    if(count >0){
      state = NO_QUARTER;
    }
  }
  public void insertQuarter(){
    if(state == HAS_QUARTER){
      System.out.println("YOU CAN NOT INSERT ANOTHER QUARTER");
    }
    else if(state == NO_QUARTER){
      state = HAS_QUARTER;
      System.out.println("YOU INSERTED A QUARTER");
    }
    else if(state == SOLD_OUT){
      System.out.println("YOU CAN NOT INSERT A QUARTER SOLD OUT!!!!");
    }
    else if(state == SOLD){
      System.out.println("WAIT");
    }
  }
   public void ejectQuarter(){
    if(state == HAS_QUARTER){
      System.out.println("Quarter returned");
    }
    else if(state == NO_QUARTER){
      System.out.println("You haven't inserted quarter");
    }
    else if(state == SOLD_OUT){
      System.out.println("sorry you already turned ther crank");
    }
    else if(state == SOLD){
      System.out.println("you can't eject you haven't inserted quarter");
    }
  }
   public void turnCrank(){
     if(state == SOLD){
      System.out.println("Turning twice doesn't get you another gumball");
    }
    else if(state == HAS_QUARTER){
      System.out.println("you turned");
      state = SOLD;
      dispense();
    }
    else if(state == NO_QUARTER){
      System.out.println("you turned but there's no quarter");
    }
    else if(state == SOLD_OUT){
      System.out.println("you turned bu there are no gumballs");
    }    
  }
   
   public void dispense(){
     if(state == SOLD){
      System.out.println("a gumball comes rolling out the slot");
      count = count -1;
      if(count ==0){
        System.out.println("oops, out of gumballs!");
        state =SOLD_OUT;
      }
      else{
        state = NO_QUARTER;
      }
    }
    else if(state == HAS_QUARTER){
      System.out.println("no gumball dispensed");
      
      dispense();
    }
    else if(state == NO_QUARTER){
      System.out.println("you need to pay first");
    }
    else if(state == SOLD_OUT){
      System.out.println("no gumball dispensed");
    }    
  }
}