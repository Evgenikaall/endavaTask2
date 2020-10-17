package com.task;

public class Basketball extends Team {
    public Basketball(String name, int numberOfPlayers, String talisman, String country) {
        super(name, numberOfPlayers, talisman, country);
        System.out.println("Creating new class of type " + this.getClass().getName());
    }

    @Override
    public void signHymn() {
        System.out.println("Let's go" + this.getClass().getName());
    }

    public void signHymn(String country){
        System.out.println("Come on !" + country);
    }
}
