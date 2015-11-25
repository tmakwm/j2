package com.j2.iterator.dinermerger.before;
import java.util.ArrayList;

public class PancakeHouseMenu{
  ArrayList menuItems;
  public PancakeHouseMenu(){
//    menuItems = new MenuItem[MAX_ITEMS];
   menuItems = new ArrayList();
   addItem("채식용 체리 팬케잌", "안에 체리가", true, 3.22);
   addItem("바베큐 팬케잌", "팬케잌안에 바베큐가", true, 3.42);
   addItem("닭 팬케잌", "치킨먹고싶다", true, 3.72);
 }
  public void addItem(String n, String d, boolean v, double p){
    MenuItem menuItem = new MenuItem(n,d,v,p);
    menuItems.add(menuItem);
  }  
  public ArrayList getMenuItems(){
    return menuItems;
  }
}