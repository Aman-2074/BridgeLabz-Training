// creating a classRocketlaunch by using for loop
import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter countdown start number: ");
        int counter = input.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launched!");

        input.close();
    }
}

