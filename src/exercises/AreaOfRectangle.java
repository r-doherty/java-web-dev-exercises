package exercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the length of Rectangle:");
        Double length = input.nextDouble();
        System.out.println("Please enter the width of Rectangle:");
        Double width = input.nextDouble();
        System.out.println("The area of the Rectangle is: " + (width*length));

    }
}
