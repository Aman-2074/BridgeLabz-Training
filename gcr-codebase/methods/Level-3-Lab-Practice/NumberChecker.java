// Creating a classNumberChecker

import java.util.Scanner;

public class NumberChecker {

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }

        int count = 0;
        int temp = Math.abs(number);

        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int number) {

        int count = countDigits(number);
        int[] digits = new int[count];

        int temp = Math.abs(number);

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {

        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }

        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("\nDigit Count: " + digitCount);

        System.out.print("Digits Array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        System.out.println("\n\nIs Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));

        int[] largestValues = findLargestAndSecondLargest(digits);
        System.out.println("\nLargest Digit: " + largestValues[0]);
        System.out.println("Second Largest Digit: " + largestValues[1]);

        int[] smallestValues = findSmallestAndSecondSmallest(digits);
        System.out.println("\nSmallest Digit: " + smallestValues[0]);
        System.out.println("Second Smallest Digit: " + smallestValues[1]);

        input.close();
    }
}
