package com.j2.iterator.dinermerger.after;
import java.util.*;
public class MenuTestDrive{
  public static void main(String args[]){
    PanMenu pm = new PanMenu();
    DinerMenu dm = new DinerMenu();
    Waitress w = new Waitress(pm, dm);
    w.printMenu();

  }
}