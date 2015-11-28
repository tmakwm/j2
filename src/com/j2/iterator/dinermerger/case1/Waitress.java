package com.j2.iterator.dinermerger.after;

public class Waitress{
 PanMenu pm;
 DinerMenu dm;
 public Waitress(PanMenu p, DinerMenu d){
   this.pm = p;
   this.dm = d;
 }
 public void printMenu(){
  Iterator pan = pm.createIterator();
  Iterator dinner = dm.createIterator();
  printMenu(pan);
  printMenu(dinner);
 }
 private void printMenu(Iterator iterator){
   while(iterator.hasNext()){
     MenuItem menuItem = (MenuItem)iterator.next();
     System.out.println(menuItem.getName() );
     System.out.println(menuItem.getDescription());
     System.out.println(menuItem.getPrice());
   }
 }
 public void printVegetarianMenu(){
   
 }
}