package com.task;

public abstract class Team {
    private final String name;
    private final int numberOfPlayers;
    private final String talisman;
    private final String country;

    public Team(String name, int numberOfPlayers, String talisman, String country) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.talisman = talisman;
        this.country = country;
    }

    public abstract void signHymn();

    @Override
    public String toString() {
        return "Team:\n" +
                "Name : " + name + '\n' +
                "Number of players : " + numberOfPlayers + '\n' +
                "Talisman : " + talisman + '\n' +
                "Country : " + country + '\n';
    }
}
