package com.j2.singleton.chocolatethread;
public class ChocolateMain{
  public static void main(String[]args){
    Chocolateboiler s1 = Chocolateboiler.getInstance();
    Chocolateboiler s2 = Chocolateboiler.getInstance();
    int i=0;

    Thread thread1 = new Thread() {
            public void run() {
                while (s1.getNumCalled() <50) {
                    s1.getInstance();        
                }
            }
        };
       thread1.start();

  Thread thread2 = new Thread() {
            public void run() {
                while (s2.getNumCalled()<50) {
                    s2.getInstance();               
                }
            }
        };
       thread2.start();
    }
  
  
 }
