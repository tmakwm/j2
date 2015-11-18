package com.j2.templatemethod.sort;
import java.util.*;

public class DuckSortTestDrive{
  public static void main(String args[]){
    Duck [] ducks = {new Duck("daffy", 8),
      new Duck("ghfy", 7), new Duck("ethfy", 2)};
    Arrays.sort(ducks);
    display(ducks);
  }
  public static void display(Duck[] ducks){
    for(int i=0; i<ducks.length; i++){
      System.out.println(ducks[i]);
    }
  }
}
