// Creating a classEuclideanDistanceAndLine

import java.util.Scanner;

public class EuclideanDistanceAndLine {

    public static double findDistance(double x1, double y1, double x2, double y2) {

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
        return distance;
    }

    public static double[] findLineEquation(double x1, double y1,
                                             double x2, double y2) {

        // Handle vertical line case
        if (x2 - x1 == 0) {
            return null; // slope undefined
        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);

        return new double[]{m, b};
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Distance calculation
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("\nEuclidean Distance = " + distance);

        double[] line = findLineEquation(x1, y1, x2, y2);

        if (line == null) {
            System.out.println("Equation of line: x = " + x1 + " (Vertical Line)");
        } else {
            System.out.println("Slope (m) = " + line[0]);
            System.out.println("Y-intercept (b) = " + line[1]);
            System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);
        }

        input.close();
    }
}
