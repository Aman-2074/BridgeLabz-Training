// Creating a classcalculateHandshakes
import java.util.Scanner;

public class HandshakeCalculator {

    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);

        // Output
        System.out.println(
            "The maximum number of possible handshakes among " +
            numberOfStudents + " students is " + handshakes
        );

        input.close();
    }
}
