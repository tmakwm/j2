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
   addItem("ä�Ŀ� ü�� ������ũ", "�ȿ� ü���� �ִ�", true, 3.22);
   addItem("�ٺ�ť ������ũ", "������ũ �ȿ� �ٺ�ť�� �ִ�", true, 3.42);
   addItem("�� ������ũ", "ġŲ�� ����ִ�", true, 3.72);
   addItem("���ڶ� ������ũ", "���ڶ� �ҽ��� ����� ������ũ", true , 3.45);
 }
  public void addItem(String n, String d, boolean v, double p){
    MenuItem menuItem = new MenuItem(n,d,v,p);
    menuItems.add(menuItem);
  }  
  public ArrayList getMenuItems(){
    return menuItems;
  }
}