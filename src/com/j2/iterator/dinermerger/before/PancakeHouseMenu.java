package com.j2.iterator.dinermerger.before;
import java.util.ArrayList;

public class PancakeHouseMenu{
  ArrayList menuItems;
  public PancakeHouseMenu(){
//    menuItems = new MenuItem[MAX_ITEMS];
   menuItems = new ArrayList();
   addItem("ä�Ŀ� ü�� ���ɟ�", "�ȿ� ü����", true, 3.22);
   addItem("�ٺ�ť ���ɟ�", "���ɟ�ȿ� �ٺ�ť��", true, 3.42);
   addItem("�� ���ɟ�", "ġŲ�԰�ʹ�", true, 3.72);
 }
  public void addItem(String n, String d, boolean v, double p){
    MenuItem menuItem = new MenuItem(n,d,v,p);
    menuItems.add(menuItem);
  }  
  public ArrayList getMenuItems(){
    return menuItems;
  }
}