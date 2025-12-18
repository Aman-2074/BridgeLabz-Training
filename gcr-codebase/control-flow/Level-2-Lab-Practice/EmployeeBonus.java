// Creating a classEmployeeBonus to calculate employee bonus
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        double bonus = 0.0;

        // Check bonus condition
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
            System.out.println("Bonus Amount is: INR " + bonus);
        } else {
            System.out.println("No bonus. Years of service should be more than 5.");
        }

        input.close();
    }
}
