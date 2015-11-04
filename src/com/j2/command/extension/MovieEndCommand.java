package com.j2.command.extension;

public class MovieEndCommand implements Command{
  DVD dvd;
  public MovieEndCommand(DVD dvd){
    this.dvd = dvd;
  }
  public void execute(){
    dvd.MovieEnd();
  }
  
}