// Creating a classSumUntilZero
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;   // to store the sum
        double number;        // to store user input

        System.out.print("Enter a number (0 to stop): ");
        number = input.nextDouble();

        // Loop until user enters 0
        while (number != 0) {
            total += number;

            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
        }

        System.out.println("The total sum is " + total);

        input.close();
    }
}
