package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Lesson09 {

    public static void main(String[] args) {

        Course course1 = new Course("java");
        Course course2 = new Course("python");
        Course course3 = new Course("1c");
        Course course4 = new Course("c++");
        Course course5 = new Course("git");
        Course course6 = new Course("c#");
        Course course7 = new Course("web");
        Course course8 = new Course("php");

        Student student1 = new Student("Lena", Arrays.asList(course1, course3, course5, course7));
        Student student2 = new Student("Ivan", Arrays.asList(course2, course4, course6, course8));
        Student student3 = new Student("Vitya", Arrays.asList(course1, course2, course3));
        Student student4 = new Student("Oleg", Arrays.asList(course4, course5, course6));
        Student student5 = new Student("Sveta", Arrays.asList(course2, course4, course6, course7, course8));

        List<Student> studentList = new ArrayList<Student>(Arrays.asList(student1, student2, student3, student4, student5));

        System.out.println(uniqueCourses(studentList));

        System.out.println(smartestStudents(studentList));

        System.out.println(courseStudents(studentList, course1));
    }

    private static boolean courseStudents(List<Student> studentList, Course course1) {
        return false;
    }

    private static boolean smartestStudents(List<Student> studentList) {
        return false;
    }

    private static boolean uniqueCourses(List<Student> studentList) {
        return false;
    }
}


