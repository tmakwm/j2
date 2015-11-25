package com.j2.iterator.dinermerger.before;

public class DinerMenu{
  static final int MAX_ITEMS = 3;
  MenuItem menuItems[];
  int number;
  public DinerMenu(){
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("채식자용 야채 수프", "토마토, 고구마, 양파", true, 3.22);
        addItem("고기수프", "소고기 수프", true, 3.42);
        addItem("삼겹살", "먹고싶다", true, 3.72);
    number =0;
  }
  public void addItem(String n, String d, boolean v, double p){
    if(number >=MAX_ITEMS){
      System.out.println("Sorry full....");
      return;
    }    
    MenuItem menuitem = new MenuItem(n,d,v,p);
    menuItems[number++] = menuitem;    
  }  
  public MenuItem[] getMenuItems(){
    return menuItems;
  }
}