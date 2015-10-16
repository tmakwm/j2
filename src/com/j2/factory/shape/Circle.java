package com.j2.factory.shape;

import java.util.*;
public class Circle extends Shape{
  DrawingFactory shapedrawingfactory;
  public Circle(DrawingFactory drawingfactory){
  description = "Circle";
  shapedrawingfactory = drawingfactory;
  radian = shapedrawingfactory.createRadian();
  }
  public String getDescription(){
    String descript = "Shape : "+ description +"\n";
    descript = descript + radian.toString();
    return descript;
  }
}