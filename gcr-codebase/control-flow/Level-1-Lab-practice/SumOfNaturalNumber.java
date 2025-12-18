// Creating a classSumOfNaturalNumber to check wheather number is natural or not 
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number");
        } else {

            // Sum using while loop
            int sumWhile = 0;
            int counter = 1;

            while (counter <= n) {
                sumWhile += counter;
                counter++;
            }

            int sumFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);

            // Compare results
            if (sumWhile == sumFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("The computations do not match.");
            }
        }

        input.close();
    }
}
