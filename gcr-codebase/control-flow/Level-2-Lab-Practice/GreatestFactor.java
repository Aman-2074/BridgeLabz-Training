// creating a classGreatestFactor

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number <= 1) {
            System.out.println("Please enter an integer greater than 1.");
        } else {

            int greatestFactor = 1;

            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }

            // Display result
            System.out.println("The greatest factor of " + number +
                    " other than itself is: " + greatestFactor);
        }

        input.close();
    }
}
