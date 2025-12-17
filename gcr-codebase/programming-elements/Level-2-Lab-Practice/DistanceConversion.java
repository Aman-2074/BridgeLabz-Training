import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversions
        double distanceInYards = distanceInFeet / 3;        // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760;    // 1 mile = 1760 yards

        // Output
        System.out.println(
            "The distance in yards is " + distanceInYards +
            " while the distance in miles is " + distanceInMiles
        );

        input.close();
    }
}
