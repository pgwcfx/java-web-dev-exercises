package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

import static java.lang.StrictMath.PI;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        while (radius <= 0){
            System.err.println("You entered an invalid radius. Please enter a valid radius.");
            System.out.println("Please enter a valid radius: ");
            radius = input.nextDouble();
        }
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
