package com.company;

public class Medicine {
    String Name, Director, Actor, Date;
    int views;
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    Level level;


    public Medicine(){}

    public Medicine(String Name, String Director, String Actor, String Date, int Raiting, int views){
        this.Name = Name;
        this.Director = Director;
        this.Actor = Actor;
        this.Date = Date;
        this.views = views;


    }
}
