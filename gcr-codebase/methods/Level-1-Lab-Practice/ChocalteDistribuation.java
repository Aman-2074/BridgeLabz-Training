// creating a classchocalateDistribuation

import java.util.Scanner;

public class ChocolateDistribution {

    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;   // chocolates per child
        int remainder = number % divisor;  // remaining chocolates

        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println(
            "Each child will get " + result[0] +
            " chocolates and the remaining chocolates are " + result[1]
        );

        input.close();
    }
}
