package com.j2.factory.shape;

public class ShapeSimulator{
  
  public static void main(String args[]){
    ShapeFactory dimension2 = new Dimension2Factory();
    ShapeFactory dimension3 = new Dimension3Factory();
    Shape shape;
    shape = dimension2.orderShape("circle");
    System.out.println(shape.getDescription());
    shape = dimension2.orderShape("rectangle");
    System.out.println(shape.getDescription());
    shape = dimension3.orderShape("circle");
    System.out.println(shape.getDescription());
    shape = dimension3.orderShape("rectangle");
    System.out.println(shape.getDescription());
  }
}