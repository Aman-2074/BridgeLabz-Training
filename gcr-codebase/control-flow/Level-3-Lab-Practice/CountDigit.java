// Creating a classCountDigit

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = 0;

        while (number != 0) {

            number = number / 10;

            count++;
        }

        // the result
        System.out.println("Number of digits = " + count);

        input.close();
    }
}

