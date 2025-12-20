// Creating a classZaraEmployeeBonus

import java.util.Scanner;

public class ZaraEmployeeBonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int employees = 10;

        double[] salary = new double[employees];
        double[] yearsOfService = new double[employees];
        double[] bonus = new double[employees];
        double[] newSalary = new double[employees];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < employees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = input.nextDouble();

            System.out.print("Enter Years of Service: ");
            yearsOfService[i] = input.nextDouble();

            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter valid salary and years of service.");
                i--; // decrement index to retry
                continue;
            }
        }

        // Calculation Loop
        for (int i = 0; i < employees; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n====== Zara Employee Bonus Summary ======");
        System.out.println("Total Old Salary of Employees : INR " + totalOldSalary);
        System.out.println("Total Bonus Payout            : INR " + totalBonus);
        System.out.println("Total New Salary of Employees : INR " + totalNewSalary);

        input.close();
    }
}
