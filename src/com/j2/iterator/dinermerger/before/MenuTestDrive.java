package com.j2.iterator.dinermerger.before;
import java.util.*;
public class MenuTestDrive{
  public static void main(String []args){
    PancakeHouseMenu p = new PancakeHouseMenu();
    DinerMenu d = new DinerMenu();
    ArrayList pm = p.getMenuItems();
    for (int i=0; i<pm.size();i++){
     MenuItem menuitem =(MenuItem) pm.get(i);
     System.out.println(menuitem.getName());
     System.out.println(menuitem.getDescription());
     System.out.println(menuitem.getPrice());
    }
    MenuItem[] dm = d.getMenuItems();
    
    for (int i=0; i<dm.length;i++){
     MenuItem menuitem =(MenuItem) dm[i];
     System.out.println(menuitem.getName());
     System.out.println(menuitem.getDescription());
     System.out.println(menuitem.getPrice());
    }
  }
}