package com.j2.templatemethod.DuckComparator;
import java.util.*;
public class DuckComparator implements Comparator<Duck>{
  public int compare(Duck d1, Duck d2){
    return d1.getWeight() - d2.getWeight();
  }
  
}