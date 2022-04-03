package com.company;

public record Course(String name) implements Courses {

    @Override
    public String toString() {
        return name;
    }
}