package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private Double yearsTeaching;

    public Teacher(String firstName,String lastName, String subject, Double yearsTeaching){
        this.firstName=firstName;
        this.lastName=lastName;
        this.subject=subject;
        this.yearsTeaching=yearsTeaching;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String aFirstName){
        firstName=aFirstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String aLastName){
        lastName=aLastName;
    }

    public String getSubject(){
        return subject;
    }
    public void setSubject(String aSubject){
        subject=aSubject;
    }

    public Double getYearsTeaching(){
        return yearsTeaching;
    }
    public void setYearsTeaching(Double aYearsTeaching){
        yearsTeaching=aYearsTeaching;
    }
}