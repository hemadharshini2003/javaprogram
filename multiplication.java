package hemadharshini;
import java.util.Scanner;
public class Multiplication {
	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the number for multiplication table: ");
	        int number = scanner.nextInt();
	        
	        System.out.print("Enter the range up to which the table should be generated: ");
	        int range = scanner.nextInt();

	        
	        System.out.println("Multiplication table for " + number + ":");
	        for (int i = 1; i <= range; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }

	        // Close the scanner
	        scanner.close();
	    }
}
