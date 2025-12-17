import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert cm to inches (1 inch = 2.54 cm)
        double baseInInch = base / 2.54;
        double heightInInch = height / 2.54;

        // Area in square inches
        double areaSqIn = 0.5 * baseInInch * heightInInch;

        // Output
        System.out.println(
            "The Area of the triangle in sq in is " + areaSqIn +
            " and sq cm is " + areaSqCm
        );

        input.close();
    }
}
