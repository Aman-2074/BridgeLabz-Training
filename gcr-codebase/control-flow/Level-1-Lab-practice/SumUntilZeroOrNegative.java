// Creating a classSumUntilZeroorNegative

import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;

        // Infinite loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();

            // Break condition
            if (number <= 0) {
                break;
            }

            total += number;
        }

        // result
        System.out.println("The total sum is " + total);

        input.close();
    }
}

