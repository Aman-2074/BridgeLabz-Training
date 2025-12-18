// Creating a classFactorialFor to check factorial while using for loop
import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a valid Natural Number (greater than 0).");
        } else {

            long factorial = 1;

            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            // Print the result
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        input.close();
    }
}

