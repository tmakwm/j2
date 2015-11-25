package com.j2.iterator.dinermerger.after;

public class Waitress{
 PanMenu pm;
 DinerMenu dm;
 public Waitress(PanMenu p, DinerMenu d){
   this.pm = p;
   this.dm = d;
 }
 public void printMenu(Iterator iterator){
   while(iterator.hasNext()){
     Menuitem menuitem = (MenuItem)iterator.next();
     System.out.println(menuitem.getName());       
     System.out.println(menuitem.getDescription());
     System.out.println(menuitem.getPrice());
   }
 }
}