  package com.j2.factory.shape;
  
  public class Dimension3DrawingFactory implements DrawingFactory{
    public Line createLine(){
      return new Dimension3Line();
    }
    public Radian createRadian(){
        return new Dimension3Radian();
    }
  }