package com.company;

public class Participant {
    private String name;
    private int distance;

    public Participant(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
