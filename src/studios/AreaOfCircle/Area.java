package studios.AreaOfCircle;

import java.util.Scanner;

public class Area {


    // In class example via Hank
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double radius = 0.0;
            do {
                System.out.print("Enter a radius: ");
                radius = input.nextDouble();
            } while (radius <= 0.0);
            System.out.println("The area of a circle of radius " + radius
                    + " is: " + Circle.getArea(radius));
        } catch (Exception badThingsHappend) {
            System.err.println("Stop inputting garbage!!");
            badThingsHappend.printStackTrace();
        }
    }

    // Personal code
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a radius: ");
//        boolean userValidation = input.hasNextDouble();
//        if (!userValidation)
//        {
//            System.out.println("Non-numerical entry detected — program terminated.");
//        }
//        else
//        {
//            Double radius = input.nextDouble();
//            while(radius < 0)
//            {
//                System.out.println("Negative entry detected — please enter positive value.");
//                radius = input.nextDouble();
//            }
//            Double area = Circle.getArea(radius);
//            System.out.println("The area of a circle with radius of " + radius + " is: " + area);
//        }
//
//    }

}
