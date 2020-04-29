package exercises;

import java.util.Scanner;

public class Mpg {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        double miles = input.nextDouble();
        System.out.println("How much gas have you consumed (in gallons)? ");
        double gas = input.nextDouble();
        double milesPerGallon = (miles/gas);
        System.out.println("The miles per gallon of your vehicle is " + milesPerGallon + " mpg.");
    }
}
