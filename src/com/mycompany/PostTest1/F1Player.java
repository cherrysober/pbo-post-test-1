/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.PostTest1;

public class F1Player {
    public String name;
    public String team;
    public int year;
    
    public F1Player(String name, String team, int year) {
        this.name = name;
        this.team = team;
        this.year = year;
    }
    
    public String getName(){
        return name;
    }
    
    public String getTeam(){
        return team;
    }
    
    public int getYear(){
        return year;
    }
}
