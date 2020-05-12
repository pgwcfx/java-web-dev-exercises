package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {
        return Integer.compare(o2.getAllergens().toString().length(), o1.getAllergens().toString().length());
    }
}
