// creating a classFactorNumberWhile

import java.util.Scanner;

public class FactorsOfNumberWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

            int counter = 1;

            // Using while loop
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++; // increment counter
            }
        }

        input.close();
    }
}

