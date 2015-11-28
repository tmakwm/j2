package com.j2.iterator.dinermerger.case1;

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
 
 public void printVegetarianMenu(){
    Iterator pan = pm.createIterator();
  Iterator dinner = dm.createIterator();
  printVegetarianMenu(pan);
  printVegetarianMenu(dinner);
 }
 
 private void printVegetarianMenu(Iterator iterator){
   while(iterator.hasNext()){
     MenuItem menuItem = (MenuItem)iterator.next();
     if(menuItem.isVegetarian()){
       System.out.println(menuItem.getName() );
       System.out.println(menuItem.getDescription());
       System.out.println(menuItem.getPrice());   
     }
 }
 }
 private void printMenu(Iterator iterator){
   while(iterator.hasNext()){
     MenuItem menuItem = (MenuItem)iterator.next();
     System.out.println(menuItem.getName() );
     System.out.println(menuItem.getDescription());
     System.out.println(menuItem.getPrice());
   }
 }
}