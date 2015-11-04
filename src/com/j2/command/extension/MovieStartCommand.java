package com.j2.command.extension;

public class MovieStartCommand implements Command{
  DVD dvd;
  public MovieStartCommand(DVD dvd){
    this.dvd = dvd;
  }
  public void execute(){
    dvd.MovieStart();
  }
  
}