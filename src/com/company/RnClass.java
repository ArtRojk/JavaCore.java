package com.company;

public class RnClass {
    public static void main(String[] args) {
        Participant[] participant = new Participant[4];
        participant[0] = new Participant("Имя1", 100);
        participant[1] = new Participant("Имя2", 150);
        participant[2] = new Participant("Имя3", 90);
        participant[3] = new Participant("Имя4", 135);
        Team team = new Team("команда1", participant);

        Course course = new Course(150, 100, 50);
        String result = course.doIt(team);
        System.out.println(result);
    }
}
