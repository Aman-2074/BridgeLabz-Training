// creating a classFriendAgeHeight we are checking three friend age and height
 
import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        // Input heights
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = input.nextDouble();

        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = input.nextDouble();

        // Find youngest friend
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Youngest friend is Amar");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Youngest friend is Akbar");
        } else {
            System.out.println("Youngest friend is Anthony");
        }

        // Find tallest friend
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Tallest friend is Amar");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Tallest friend is Akbar");
        } else {
            System.out.println("Tallest friend is Anthony");
        }

        input.close();
    }
}

