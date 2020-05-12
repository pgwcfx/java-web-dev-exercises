package exercises.technology;

import exercises.technology.Computer;

import java.util.ArrayList;

public class Smartphone extends Computer {

    private ArrayList<String> contacts;

    public Smartphone(ArrayList<String> aApplication, double aMemory, ArrayList<String> aContact){
        super(aApplication,aMemory);
        contacts = aContact;
    }

    public ArrayList<String> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<String> contacts) {
        this.contacts = contacts;
    }
}
