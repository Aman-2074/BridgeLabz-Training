// Creating a classSumOfNaturalFOR to check wheather the number is natural is not by using for loop
import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid Natural Number (greater than 0).");
        } else {

            // Sum using for loop
            int sumByLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumByLoop += i;
            }

            // Sum using formula
            int sumByFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using for loop = " + sumByLoop);
            System.out.println("Sum using formula = " + sumByFormula);

            // Compare results
            if (sumByLoop == sumByFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is a mismatch in the results.");
            }
        }

        input.close();
    }
}

