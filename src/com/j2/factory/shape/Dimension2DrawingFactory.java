  package com.j2.factory.shape;
  
  public class Dimension2DrawingFactory implements DrawingFactory{
    public Line createLine(){
      return new Dimension2Line();
    }
    public Radian createRadian(){
      return new Dimension2Radian();
    }
  }