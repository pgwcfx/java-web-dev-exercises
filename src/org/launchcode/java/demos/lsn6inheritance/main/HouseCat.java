package org.launchcode.java.demos.lsn6inheritance.main;

import org.launchcode.java.demos.lsn6inheritance.main.Cat;

public class HouseCat extends Cat {
    private final String name;
    private final String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {

        if (isSatisfied()){
            return "Hello, my name is " + name + "!";
        } else {
            return super.noise();
        }
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}
