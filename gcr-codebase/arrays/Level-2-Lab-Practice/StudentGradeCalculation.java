// Creating a classStudentGradecalculation

import java.util.Scanner;

public class StudentGradeCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = input.nextDouble();

            System.out.print("Chemistry: ");
            chemistry[i] = input.nextDouble();

            System.out.print("Maths: ");
            maths[i] = input.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks! Please enter positive values.");
                i--; // decrement index to re-enter
                continue;
            }
        }

        for (int i = 0; i < n; i++) {

            double total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = (total / 300) * 100;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        System.out.println("\n========= Student Result =========");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics    : " + physics[i]);
            System.out.println("Chemistry  : " + chemistry[i]);
            System.out.println("Maths      : " + maths[i]);
            System.out.println("Percentage : " + percentage[i] + "%");
            System.out.println("Grade      : " + grade[i]);
            System.out.println("--------------------------------");
        }

        input.close();
    }
}
