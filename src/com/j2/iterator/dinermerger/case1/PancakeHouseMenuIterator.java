package com.j2.iterator.dinermerger.after;
import java.util.ArrayList;
public class PancakeHouseMenuIterator implements Iterator{
   ArrayList items;
  int position = 0;
  public PancakeHouseMenuIterator(ArrayList menus){
    items = menus;
  }
  public boolean hasNext(){
    //if(position >= items.length || items[position]==null){
    if(position >= items.size()){
      return false;
    }
    return true;
  }
  public Object next(){
//    MenuItem menuitem = items[position++];
    Object object = items.get(position++);
    return object;
  }
}