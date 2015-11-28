package com.j2.iterator.dinermerger.case1;
import java.util.ArrayList;
public class PanMenu implements Menu{
  ArrayList menuItems;
  public Iterator createIterator(){
    return new PancakeHouseMenuIterator(menuItems);
  }
  public PanMenu(){
//    menuItems = new MenuItem[MAX_ITEMS];
   menuItems = new ArrayList();
   addItem("채식용 체리 팬케이크", "안에 체리가 있다", true, 3.22);
   addItem("바베큐 팬케이크", "팬케이크 안에 바베큐가 있다", true, 3.42);
   addItem("닭 팬케이크", "치킨이 들어있다", true, 3.72);
   addItem("누텔라 팬케이크", "누텔라 소스를 곁들인 팬케이크", true , 3.45);
 }
  public void addItem(String n, String d, boolean v, double p){
    MenuItem menuItem = new MenuItem(n,d,v,p);
    menuItems.add(menuItem);
  }  
  public ArrayList getMenuItems(){
    return menuItems;
  }
}