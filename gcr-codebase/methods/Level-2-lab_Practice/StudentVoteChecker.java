// Creating a classStudentVoteChecker

import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check whether a student can vote
    public boolean canStudentVote(int age) {

        if (age < 0) {
            return false;
        }

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            boolean canVote = checker.canStudentVote(ages[i]);

            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        input.close();
    }
}
