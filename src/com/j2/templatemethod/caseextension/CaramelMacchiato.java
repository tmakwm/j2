package com.j2.templatemethod.caseextension;
import java.io.*;
public class CaramelMacchiato extends CaffeineBeverageWithHook{
public void brew(){
    System.out.println("dripping");
  }
  public void addCondiments(){
    System.out.println("adding vanilla syrup + espresso + milk + caramel");
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
    System.out.print("Would you like to add vanilla syrup and espresso and milk and caramel to CaramelMacchiato? (y/n) ");
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