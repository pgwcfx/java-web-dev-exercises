package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    public String gradeLevel;
    public Student(String name, int studentId){
        this(name,studentId,0,0);
    }

    public Student(String name){
        this(name,nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade){
        double totalQualityScore = gpa*numberOfCredits;
        if (grade >= 93 && grade <= 100){
            totalQualityScore=(4.0*courseCredits)+totalQualityScore;
            numberOfCredits+=courseCredits;
            gpa=totalQualityScore/numberOfCredits;
        } else if (grade < 93 && grade >= 90){
            totalQualityScore=(3.7*courseCredits)+totalQualityScore;
            numberOfCredits+=courseCredits;
            gpa=totalQualityScore/numberOfCredits;
        } else if (grade < 90 && grade >= 87){
            totalQualityScore=(3.3*courseCredits)+totalQualityScore;
            numberOfCredits+=courseCredits;
            gpa=totalQualityScore/numberOfCredits;
        } else if (grade < 87 && grade >= 83){
            totalQualityScore=(3.0*courseCredits)+totalQualityScore;
            numberOfCredits+=courseCredits;
            gpa=totalQualityScore/numberOfCredits;
        } else if (grade < 83 && grade >= 80){
            totalQualityScore=(2.7*courseCredits)+totalQualityScore;
            numberOfCredits+=courseCredits;
            gpa=totalQualityScore/numberOfCredits;
        } else if (grade < 80 && grade >= 77){
            totalQualityScore=(2.3*courseCredits)+totalQualityScore;
            numberOfCredits+=courseCredits;
            gpa=totalQualityScore/numberOfCredits;
        } else if (grade < 77 && grade >= 73){
            totalQualityScore=(2.0*courseCredits)+totalQualityScore;
            numberOfCredits+=courseCredits;
            gpa=totalQualityScore/numberOfCredits;
        } else if (grade < 73 && grade >= 70){
            totalQualityScore=(1.7*courseCredits)+totalQualityScore;
            numberOfCredits+=courseCredits;
            gpa=totalQualityScore/numberOfCredits;
        } else if (grade < 70 && grade >= 67){
            totalQualityScore=(1.3*courseCredits)+totalQualityScore;
            numberOfCredits+=courseCredits;
            gpa=totalQualityScore/numberOfCredits;
        }else if (grade < 67 && grade >= 65){
            totalQualityScore=(1.0*courseCredits)+totalQualityScore;
            numberOfCredits+=courseCredits;
            gpa=totalQualityScore/numberOfCredits;
        } else if (grade < 65){
            totalQualityScore=(0.0*courseCredits)+totalQualityScore;
            numberOfCredits+=courseCredits;
            gpa=totalQualityScore/numberOfCredits;
        }
        // Update the appropriate fields: numberOfCredits, gpa
    }

    public String getGradeLevel() {
        if (numberOfCredits <= 29 && numberOfCredits >= 0){
            gradeLevel = "Freshman";
        } else if (numberOfCredits >= 30 && numberOfCredits <= 59){
            gradeLevel = "Sophomore";
        } else if (numberOfCredits >= 60 && numberOfCredits <= 89){
            gradeLevel = "Junior";
        } else if (numberOfCredits >= 90){
            gradeLevel = "Senior";
        }
        return gradeLevel;
        // Determine the grade level of the student based on numberOfCredits
    }

    public Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name=name;
        this.studentId=studentId;
        this.numberOfCredits=numberOfCredits;
        this.gpa=gpa;
    }

    public String getName() {
        return name;
    }
    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits=aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double aGpa) {
        gpa=aGpa;
    }

    public  boolean equals(Object toBeCompared){

        if (toBeCompared == this){
            return true;
        }

        if (toBeCompared == null){
            return false;
        }

        if (toBeCompared.getClass() != getClass()){
            return false;
        }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }

    public String toString(){
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

}