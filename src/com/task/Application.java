package com.task;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Team> teams = fillList();
        showFootballTeams(teams);
        showBasketballTeams(teams);
        showAnotherTeams(teams);
    }

    public static void  showFootballTeams(List<Team> teams){
        System.out.println("List of Football teams");
        teams.stream()
                .filter(team -> team.getClass().getName().endsWith("Football"))
                .forEach(System.out::println);
    }

    public static void  showBasketballTeams(List<Team> teams){
        System.out.println("List of Basketball teams");
        teams.stream()
                .filter(team -> team.getClass().getName().endsWith("Basketball"))
                .forEach(System.out::println);
    }

    public static void  showAnotherTeams(List<Team> teams){
        System.out.println("List of another teams");
        teams.stream()
                .filter(team -> !team.getClass().getName().endsWith("Football"))
                .filter(team -> !team.getClass().getName().endsWith("Basketball"))
                .forEach(System.out::println);
    }

    public static List<Team> fillList() {
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(new Football(
                "FC BC",
                12,
                "Bull",
                "Russia")
        );

        teams.add(new Basketball(
                "Chicago",
                6,
                "Chert",
                "USA")
        );

        teams.add(new Litrball(
                "Students",
                32,
                "Bottle",
                "RM")
        );
        teams.add(new Football(
                "NogiNeNogi",
                12,
                "Ball",
                "Africa")
        );
        return teams;
    }
}
