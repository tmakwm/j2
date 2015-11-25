package com.j2.iterator.dinermerger.after;
import java.util.*;
public class MenuTestDrive{
  public static void main(String args[]){
    PanMenu pm = new PanMenu();
    DinerMenu dm = new DinerMenu();
    Waitress w = new Waitress(pm, dm);
    Iterator p = new PancakeHouseMenuIterator(pm);
    Iterator d = new DinerMenuIterator(dm);
    w.printMenu(p);
    w.printMenu(d);
  }
}