package com.company;

public class Film {
    String Name, Director, Actor, Date;
    int views;
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    Level level;


    public Film(){}

    public Film(String Name, String Director, String Actor, String Date, int Raiting, int views){
        this.Name = Name;
        this.Director = Director;
        this.Actor = Actor;
        this.Date = Date;
        this.views = views;


    }
}
