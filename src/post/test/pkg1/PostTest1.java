/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package post.test.pkg1;

import java.util.ArrayList;

class F1Player {
    private String name;
    private String team;
    private int year;
    
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

public class PostTest1 {
    public static void main(String[] args) {
    ArrayList<F1Player> f1Players = new ArrayList<>();
    
    f1Players.add(new F1Player("Charles Leclerc", "Ferrari", 2019));
    f1Players.add(new F1Player("Carlos Sainz", "Ferrari", 2022));
    f1Players.add(new F1Player("Max Verstappen", "Red Bull", 2016));
    f1Players.add(new F1Player("Lewis Hamilton", "Mercedes", 2007));
    f1Players.add(new F1Player("Oscar Piastri", "McLaren", 2020));
    f1Players.add(new F1Player("Michael Schumacher", "Benetton", 1992));
    f1Players.add(new F1Player("Jenson Button", "Brawn GP", 2006));
    
    for (F1Player player : f1Players){
        String operator = "Pemain F1 " + player.getName() + " dari tim " + player.getTeam() + " mendapatkan first win pada tahun " + player.getYear();
        System.out.println(operator);
        }
    }
    
}
