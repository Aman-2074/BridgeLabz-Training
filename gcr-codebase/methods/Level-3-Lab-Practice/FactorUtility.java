// Creating a classFactorUtility

import java.util.Scanner;

public class FactorsUtility {

    public static int[] findFactors(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];

        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int findGreatestFactor(int[] factors, int number) {
        int greatest = 1;

        for (int factor : factors) {
            if (factor != number && factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
	
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.print("\nFactors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println("\n\nGreatest Factor (excluding itself): "
                + findGreatestFactor(factors, number));

        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: "
                + findProductOfCubeOfFactors(factors));

        input.close();
    }
}
