package hemadharshini;
import java.util.Scanner;
public class Oddoreven {
	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number to check the number is odd or even: ");
	        int number = scanner.nextInt();

	        boolean isEven = false;

	        for (int i = 0; i < 1; i++) {
	      
	            if (number % 2 == 0) {
	                isEven = true;
	            }
	        }
	        if (isEven) {
	            System.out.println(number + " is even number.");
	        } else {
	            System.out.println(number + " is odd number.");
	        }

	        scanner.close();
	    }

}

