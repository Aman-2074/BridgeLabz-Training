// Creating a classNumberAnalysis

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        // Take user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\nNumber Analysis:");

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            } 
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } 
            else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        System.out.println("\nComparison of first and last elements:");

        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are Equal");
        } 
        else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is Greater than last element");
        } 
        else {
            System.out.println("First element is Less than last element");
        }

        input.close();
    }
}
