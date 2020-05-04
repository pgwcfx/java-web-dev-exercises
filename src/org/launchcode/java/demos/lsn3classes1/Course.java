package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {

    private String subject;

    private Double lengthInHours;
    private ArrayList<String> homework;

    private ArrayList<String> schoolSupplies;

    public Course(String subject, Double lengthInHours, ArrayList<String> homework, ArrayList<String> schoolSupplies) {
        this.subject = subject;
        this.lengthInHours = lengthInHours;
        this.homework = homework;
        this.schoolSupplies = schoolSupplies;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (o == null){
            return false;
        }
        if (o.getClass() != getClass()){
            return false;
        }
        Course course = (Course) o;
        return subject.equals(course.subject) &&
                homework.equals(course.homework);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, homework);
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", lengthInHours=" + lengthInHours +
                ", homework=" + homework +
                ", schoolSupplies=" + schoolSupplies +
                '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getLengthInHours() {
        return lengthInHours;
    }

    public void setLengthInHours(Double lengthInHours) {
        this.lengthInHours = lengthInHours;
    }

    public ArrayList<String> getHomework() {
        return homework;
    }

    public void setHomework(ArrayList<String> homework) {
        this.homework = homework;
    }

    public ArrayList<String> getSchoolSupplies() {
        return schoolSupplies;
    }

    public void setSchoolSupplies(ArrayList<String> schoolSupplies) {

        this.schoolSupplies = schoolSupplies;
    }

}


