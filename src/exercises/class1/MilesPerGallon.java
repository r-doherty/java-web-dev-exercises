package exercises.class1;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        Double milesDriven = input.nextDouble();
        System.out.println("How much gas have you used? (in gallons) ");
        Double gasConsumed = input.nextDouble();
        Double milesPerGallon = milesDriven/gasConsumed;

        System.out.println("You are currently getting " + (milesPerGallon) + " miles per gallon.");
    }
}
