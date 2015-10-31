package com.j2.singleton.chocolatethread;
import java.util.*;
public class Chocolateboiler extends Thread{
  private static boolean empty;
  private static boolean boiled;
  private static int numCalled;
  private static Chocolateboiler uniqueInstance = new Chocolateboiler();
  private Chocolateboiler() {
   System.out.println("create INSTANCE!!!");
  empty = true;
  boiled = false;
 }
  public static synchronized Chocolateboiler getInstance(){
    fill();
    boil();
    drain();
    System.out.println("numcalled: " + numCalled++);
    return uniqueInstance;
  }
   public static void fill() {
  if (isEmpty()) {
   empty = false;
   boiled = false;
   System.out.println("filled" );
  }
 }
 
 public static void drain() {
  if (!isEmpty() && isBoiled()) {
   empty = true;
   System.out.println("drained");
  }
 }
 
 public int getNumCalled(){
   return numCalled;
 }
 public static void boil() {
  if (!isEmpty() && !isBoiled()) {
   boiled = true;
   System.out.println("boiled");
  }
 }
  public static boolean isEmpty(){
    return empty;
  }
  public static boolean isBoiled() {
  return boiled;
 }
}