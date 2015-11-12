package com.j2.adapter.caseextension;
import java.util.*;

public class EnumeratorAdapter implements Iterator{
  Enumeration enumerator;
  public EnumeratorAdapter(Enumeration enumerator) {
  this.enumerator = enumerator;
 }
 
 public boolean hasNext() {
  return enumerator.hasMoreElements();
 }
 
 public Object next() {
  return enumerator.nextElement();
 }
 
 public void remove() {
  throw new UnsupportedOperationException();
 }
}