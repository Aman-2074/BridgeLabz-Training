// Creating a classArraySumUntilZero

import java.util.Scanner;

public class ArraySumUntilStop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        double total = 0.0;

        int index = 0;

        System.out.println("Enter numbers (0 or negative number to stop):");

        while (true) {

            if (index == 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

            System.out.print("Enter number: ");
            double value = input.nextDouble();

            if (value <= 0) {
                break;
            }
			
            numbers[index] = value;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total = total + numbers[i];
        }

        System.out.println("\nStored Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\nTotal Sum = " + total);

        input.close();
    }
}
