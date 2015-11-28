package com.j2.iterator.dinermerger.after;

public class DinerMenu implements Menu{
  public Iterator createIterator(){
    return new DinerMenuIterator(menuItems);
  }
  static final int MAX_ITEMS = 4;
  MenuItem menuItems[];
  int number;
  public DinerMenu(){
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("채식자용 야채 수프", "토마토, 고구마, 양파로 맛을 낸 수프", true, 3.22);
        addItem("고기수프", "소고기 수프", true, 3.42);
        addItem("삼겹살", "고소한 삼겹살", true, 3.72);
        addItem("야채피자", "채식주의자들을 위한 피자", true , 3.55);
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