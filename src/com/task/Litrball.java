package com.task;

public class Litrball extends Team{
    public Litrball(String name, int numberOfPlayers, String talisman, String country) {
        super(name, numberOfPlayers, talisman, country);
        System.out.println("Creating new class of type " + this.getClass().getName());
    }

    @Override
    public void signHymn() {
        System.out.println("My bottle is empty" + this.getClass().getName());
    }

    public void signHymn(String country){
        System.out.println("It's my " + country);
    }
}
