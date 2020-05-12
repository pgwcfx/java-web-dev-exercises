package exercises.technology;

import exercises.technology.Computer;

import java.util.ArrayList;

public class Laptop extends Computer {

    private final String model;

    public Laptop(String aModel, ArrayList<String> aApplication, ArrayList<String> aFile, double aMemory){
        super(aApplication,aFile,aMemory);
        model=aModel;
    }

    public String getModel() {
        return model;
    }
}
