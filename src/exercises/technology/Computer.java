package exercises.technology;

import java.util.ArrayList;

public abstract class Computer {

    private static ArrayList<String> applications;
    private static ArrayList<String> files;
    private final double memory;

    public Computer(ArrayList<String> applications, double memory) {
        this.applications = applications;
        this.memory = memory;
    }

    public Computer(ArrayList<String> applications, ArrayList<String> files, double memory){
        this.applications=applications;
        this.files=files;
        this.memory=memory;
    }

    public ArrayList<String> getApplications() {
        return applications;
    }

    public void setApplications(ArrayList<String> applications) {
        this.applications = applications;
    }

    public ArrayList<String> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<String> files) {
        this.files = files;
    }

    public double getMemory() {
        return memory;
    }

    public static int countApps(){
        int count=0;
        for (String i: applications){
            count++;
        }
        return count;
    }

    public static int countFiles(){
        int count=0;
        for (String j: files){
            count++;
        }
        return count;
    }

    public String getInfo(){
        return ("This computer has a memory of " + this.memory + ", has " + Computer.countApps() + " applications and has " + Computer.countFiles() + " files.");
    }
}
