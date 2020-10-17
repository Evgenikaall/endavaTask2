package com.task;

public class Football extends Team {
    public Football(String name, int numberOfPlayers, String talisman, String country) {
        super(name, numberOfPlayers, talisman, country);
        System.out.println("Creating new class of type " + this.getClass().getName());
    }

    @Override
    public void signHymn() {
        System.out.println("Bu-ga-ga " + this.getClass().getName());
    }

    public void signHymn(String country) {
        System.out.println("Let's go - " + country);
    }
}
