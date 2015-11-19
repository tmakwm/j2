package com.j2.templatemethod.DuckComparator;

public class Duck{
  String name;
  int weight;
  public Duck(String name, int weight){
    this.name = name;
    this.weight = weight;
  }
  public int getWeight(){
    return weight;
  }
  public String toString(){
    return name + "  weighs " +weight;
  }
}