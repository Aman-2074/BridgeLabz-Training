// Creating a classYoungestAndTallestFriend

import java.util.Scanner;

public class YoungestAndTallestFriend {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for " + names[i]);

            System.out.print("Enter Age: ");
            age[i] = input.nextInt();

            System.out.print("Enter Height (in cm): ");
            height[i] = input.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output
        System.out.println("\n===== Result =====");
        System.out.println("Youngest Friend : " + names[youngestIndex] +
                " (Age: " + age[youngestIndex] + ")");
        System.out.println("Tallest Friend  : " + names[tallestIndex] +
                " (Height: " + height[tallestIndex] + " cm)");

        input.close();
    }
}
