// Creating a classCheckNumberSign wheather they are positive neagative or zero
import java.util.Scanner;

public class CheckNumberSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking the number
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        input.close();
    }
}
