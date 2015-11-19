package com.j2.templatemethod.caseextension;
import java.io.*;
public class CoffeeWithHook extends CaffeineBeverageWithHook{
  public void brew(){
    System.out.println("dripping");
  }
  public void addCondiments(){
    System.out.println("adding sugar + milk");
  }
  public boolean customerWantsCondiments(){
    String answer = getUserInput();
    if(answer.toLowerCase().startsWith("y")){
      return true;
    }
    else{
      return false;
  }
}
  public String getUserInput(){
    String answer = null;
    System.out.print("Would you like to add milk and sugar? (y/n) ");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try{answer = in.readLine();
    }
    catch(IOException ioe){
      System.err.println("IO error trying to read your answer");
    }
    if(answer == null){
      return "no";
    }
       
    return answer;   
    }
}