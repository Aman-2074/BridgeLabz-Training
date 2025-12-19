// Creating a classLeapYear

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Part 1: Using multiple if-else
        System.out.println("\nUsing multiple if-else:");

        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year 1582 or later.");
        } else {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }
        }
		
        // Part 2: Using single if with logical operators
        System.out.println("\nUsing single if statement:");

        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");
        } else if (year >= 1582) {
            System.out.println(year + " is NOT a Leap Year");
        } else {
            System.out.println("Leap Year calculation is valid only for year 1582 or later.");
        }

        input.close();
    }
}
