package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){

        HashMap<Integer,String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students names (or ENTER to finish): ");

        do {

            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("ID number: ");
                Integer newStudentIdNumber = input.nextInt();
                students.put(newStudentIdNumber,newStudent);

                input.nextLine();
            }

        } while (!newStudent.equals(""));

        System.out.println("\nClass Roster:");

        for (Map.Entry<Integer,String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
