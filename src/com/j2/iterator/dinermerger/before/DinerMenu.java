package com.j2.iterator.dinermerger.before;

public class DinerMenu{
  static final int MAX_ITEMS = 3;
  MenuItem menuItems[];
  int number;
  public DinerMenu(){
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("ä���ڿ� ��ä ����", "�丶��, ����, ����", true, 3.22);
        addItem("������", "�Ұ�� ����", true, 3.42);
        addItem("����", "�԰�ʹ�", true, 3.72);
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