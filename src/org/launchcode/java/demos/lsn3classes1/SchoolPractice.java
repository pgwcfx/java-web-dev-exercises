package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.List;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student paul = new Student("Paul",18197388,1,4.0);
        System.out.println(paul.getName());
        System.out.println(paul.getStudentId());
        System.out.println(paul.getNumberOfCredits());
        System.out.println(paul.getGpa());

        Course Calculus1 = new Course("Math",5.0,
                new ArrayList<>(List.of("5.3 worksheet","5.4 worksheet","5.5 worksheet","5.3 quiz","5.3 practice problems")),
                new ArrayList<>(List.of("Calculus textbook","notebooks")));
        Teacher Adams = new Teacher("Ashley","Adams","Math",10.0);
    }
}
