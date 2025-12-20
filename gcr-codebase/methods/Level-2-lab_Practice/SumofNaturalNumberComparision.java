// Creating a classSumOfNaturalNumberComparision

import java.util.Scanner;

public class SumOfNaturalNumbersComparison {

    public static int sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
            input.close();
            return;
        }

        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);

        System.out.println("Sum using Recursion : " + recursiveSum);
        System.out.println("Sum using Formula   : " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Result is correct. Both computations match.");
        } else {
            System.out.println("Result is incorrect. Computations do not match.");
        }

        input.close();
    }
}
