import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Calculating quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Printing output
        System.out.println("The Quotient is " + quotient +
                           " and Reminder is " + remainder +
                           " of two number " + number1 +
                           " and " + number2);

        input.close();
    }
}
