package com.j2.factory.shape;
public abstract class ShapeFactory{
  abstract Shape createShape(String type);  
  Shape orderShape(String type){
    Shape shape = createShape(type);
    return shape;
  }
}