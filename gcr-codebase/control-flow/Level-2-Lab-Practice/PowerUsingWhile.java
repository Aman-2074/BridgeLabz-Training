// Creating a class PowerUsingWhile

import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input values
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Check for positive integers
        if (number >= 0 && power >= 0) {

            int result = 1;     // initial value
            int counter = 0;    // temp variable

            // while loop
            while (counter < power) {
                result = result * number;
                counter++;
            }

            // Print result
            System.out.println(number + " raised to the power " + power + " is " + result);
        } else {
            System.out.println("Please enter positive integers only.");
        }

        input.close();
    }
}

