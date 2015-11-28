package com.j2.iterator.dinermerger.case1;

public class DinerMenuIterator implements Iterator{
  MenuItem[] items;
  int position = 0;
  public DinerMenuIterator(MenuItem[] menus){
    items = menus;
  }
  public boolean hasNext(){
    if(position >= items.length || items[position]==null){
      return false;
    }
    return true;
  }
  public Object next(){
    MenuItem menuitem = items[position++];
    return menuitem;
  }
}