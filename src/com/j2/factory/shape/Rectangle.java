package com.j2.factory.shape;

public class Rectangle extends Shape{
  DrawingFactory shapedrawingfactory;
  public Rectangle(DrawingFactory drawingfactory){
  description = "Rectangle";
  shapedrawingfactory = drawingfactory;
  line = shapedrawingfactory.createLine();
  }
  public String getDescription(){
    String descript = "Shape : "+ description +"\n";
    descript = descript + line.toString();
    return descript;
  }
}