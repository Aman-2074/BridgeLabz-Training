import java.util.Scanner;

public class AreaofCircle {
	public static void main(string[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the radius of the circle : ");
		double radius = sc.nextDouble();
		double area = Math.PI * radius * radius;
		System.out.println("area of the circle = " + area);
		sc.close();
	}
}
	