package com.j2.iterator.dinermerger.case1;
import java.util.*;
public class MenuTestDrive{
  public static void main(String args[]){
    PanMenu pm = new PanMenu();
    DinerMenu dm = new DinerMenu();
    Waitress w = new Waitress(pm, dm);
    w.printMenu();
    System.out.println("for vegetarian");
    w.printVegetarianMenu();
  }
}