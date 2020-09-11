package com.company;

public class Film{
    private String Name, Director, Actor, Date;
    int views;
     enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    Level level;

    public String getActor() {
        return Actor;
    }

    public void setActor(String actor) {
        Actor = actor;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }




    public Film(){}

    public Film(String Name, String Director, String Actor, String Date, int Raiting, int views){
        this.Name = Name;
        this.Director = Director;
        this.Actor = Actor;
        this.Date = Date;
        this.views = views;


    }

    public Level SetLevel(int num) {
        Level result = Level.LOW;


        if (num > 7) {
            result = Level.HIGH;
        } else if (num > 4) {
            result = Level.MEDIUM;
        }

        return result;
    }
}
