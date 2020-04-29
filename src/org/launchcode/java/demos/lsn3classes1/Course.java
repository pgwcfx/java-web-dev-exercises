package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String subject;
    private Double lengthInHours;
    private ArrayList<String> homework = new ArrayList<>();
    private ArrayList<String> schoolSupplies = new ArrayList<>();
    public Course(String subject, Double lengthInHours, ArrayList<String> homework, ArrayList<String> schoolSupplies){
        this.subject = subject;
        this.lengthInHours = lengthInHours;
        this.homework = homework;
        this.schoolSupplies = schoolSupplies;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String aSubject){
        subject=aSubject;
    }

    public Double getLengthInHours() {
        return lengthInHours;
    }
    public void setLengthInHours(Double aLengthInHours) {
        lengthInHours = aLengthInHours;
    }

    public ArrayList<String> getHomework() {
        return homework;
    }
    public void setHomework(ArrayList<String> aHomework) {
        homework = aHomework;
    }

    public ArrayList<String> getSchoolSupplies() {
        return schoolSupplies;
    }
    public void setSchoolSupplies(ArrayList<String> aSchoolSupply) {
        schoolSupplies = aSchoolSupply;
    }
}
