// Creating a classNumberSignCheck

import java.util.Scanner;

public class NumberSignCheck {

    public static int checkNumber(int number) {

        if (number > 0) {
            return 1;     // Positive
        } else if (number < 0) {
            return -1;    // Negative
        } else {
            return 0;     // Zero
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int result = checkNumber(number);

        // Output
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        input.close();
    }
}
