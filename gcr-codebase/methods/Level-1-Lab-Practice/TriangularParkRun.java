// Creating a classTriangularparkRun

import java.util.Scanner;

public class TriangularParkRun {

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 km in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = input.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        // Output
        System.out.println(
            "The athlete must complete " + rounds +
            " rounds to finish a 5 km run."
        );

        input.close();
    }
}
