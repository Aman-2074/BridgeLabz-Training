// creating a classGreatestFactorWhile 
import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("Please enter an integer greater than 1.");
        } else {

            int greatestFactor = 1;
            int counter = number - 1;

            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }

            // Display result
            System.out.println("Greatest factor of " + number +
                    " other than itself is: " + greatestFactor);
        }

        input.close();
    }
}

