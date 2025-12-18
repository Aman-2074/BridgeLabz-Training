// Creating a classFactorialWhile to cheack factorial while using while loop
import java.util.Scanner;

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {

            long factorial = 1;
            int i = 1;

            // Calculate factorial using while loop
            while (i <= number) {
                factorial = factorial * i;
                i++;
            }

            // Print the result
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        input.close();
    }
}

