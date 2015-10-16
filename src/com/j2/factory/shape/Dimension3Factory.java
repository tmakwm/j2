package com.j2.factory.shape;

public class Dimension3Factory extends ShapeFactory{
  public Shape createShape(String type){
  Shape shape;
    DrawingFactory drawingfactory;
    if(type.equals("rectangle")){
      
      drawingfactory = new Dimension3DrawingFactory();
      shape = new Rectangle(drawingfactory);
     
      return shape;
    }
    else if(type.equals("circle")){
      drawingfactory = new Dimension3DrawingFactory();
      shape = new Circle(drawingfactory);      
      
      return shape;
    }
    else
      return null;
  }
}