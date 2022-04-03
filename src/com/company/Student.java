package com.company;

import java.util.List;

public record Student(String name, List<Course> courseList) implements Students {

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
