// Creating a classOddEvenArray

import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            input.close();
            return;
        }

        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        input.close();
    }
}
