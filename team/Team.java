/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

/**
 *
 * @author 19101136
 */
public class Team {
  protected String name = null;
  protected String mascot = "Default mascot";
  Team(String name, String mascot){
    this.name = name;
    this.mascot = mascot;
  }
  public void getMascot(){
       System.out.println(mascot);
  }
 
}

    

