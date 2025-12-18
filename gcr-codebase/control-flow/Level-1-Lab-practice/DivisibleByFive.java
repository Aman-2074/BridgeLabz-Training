// creating a classDivsibleByFive to chech wheather a number is divisible by five or not
import java.util.Scanner;
public class DivisibleByFive{
   public static void main (String[] args){
      Scanner input = new Scanner(System.in);
	  // Taking user input
	  System.out.print("enter a number : ");
	  int number = input.nextInt();
	  
	  if (number % 5 == 0) {
	     System.out.println("is the number" + number + "divisible by 5? yes");
		 } else {
		     System.out.println("is the number" + number + "divisibleby 5? NO");
			 }

             input.close();
		}
    }
	
		
