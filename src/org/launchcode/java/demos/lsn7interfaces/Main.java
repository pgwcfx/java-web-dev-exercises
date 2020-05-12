package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        System.out.println("Before:\n");
        for (Flavor flavor: flavors){
            System.out.println(flavor.getAllergens());
        }
        flavors.sort(new FlavorComparator());
        System.out.println("\nAfter:\n");
        for (Flavor flavor: flavors){
            System.out.println(flavor.getAllergens());
        }

        System.out.println("\nBefore:\n");
        for (Topping topping: toppings){
            System.out.println(topping.getName());
        }
        toppings.sort(new ToppingComparator());
        System.out.println("\nAfter:\n");
        for (Topping topping: toppings){
            System.out.println(topping.getName());
        }

        System.out.println("\nBefore:\n");
        for (Cone cone: cones){
            System.out.println(cone.getName() + ": " + cone.getCost());
        }
        cones.sort(new ConeComparator());
        System.out.println("\nAfter:\n");
        for (Cone cone: cones){
            System.out.println(cone.getName() + ": " + cone.getCost());
        }

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
