package com.j2.adapter.caseextension;

import java.util.*;

public class TestDrive {
 public static void main (String args[]) {
   
  ArrayList v = new ArrayList(Arrays.asList(args));  
  
   Enumeration iteratoradapter = new IteratorAdapter(v.iterator());  
  while (iteratoradapter.hasMoreElements()) {
   System.out.println("iterator adapter :"+iteratoradapter.nextElement());
  }
  Vector v1 = new Vector(Arrays.asList(args));
  Iterator emumeratoradapter = new EnumeratorAdapter(v1.elements());
  while(emumeratoradapter.hasNext()){
    System.out.println("Enumerator Adapter: " + emumeratoradapter.next());
  }
 }
}