package com.j2.iterator.dinermerger.case1;

public class MenuItem{
String name;
String description;
boolean vegetarian;
double price;
public String getName(){
  return name;
}
public String getDescription(){
  return description;
}
public double getPrice(){
  return price;
}
public boolean isVegetarian(){
  return vegetarian;
}
public String toString(){
  return name+", $"+ price + ", " +description;
}
public MenuItem(String name, String description, boolean vegetarian, double price){
  this.name = name;
  this.description = description;
  this.vegetarian = vegetarian;
  this.price = price;
}
}