// Creating a classRocketLaunchCountdown by using while loop
import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter countdown start number: ");
        int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;   // decrement counter
        }

        System.out.println("Rocket Launched!");

        input.close();
    }
}
