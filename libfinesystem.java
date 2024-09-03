package hemadharshini;
import java.util.Scanner;
public class Finesystem {
	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of days : ");

	        int dueDays = scanner.nextInt();
	        if (dueDays < 0) {

	            System.out.println("Invalid number of days. Please enter a non-negative number.");

	        } else if (dueDays == 0) {

	            System.out.println("No fine. The book is returned.");

	        } else if (dueDays >= 1 && dueDays <= 10) {

	            int fine = dueDays * 10;

	            System.out.printf("Fine: Rs. %d\n", fine);

	        } else if (dueDays >= 11 && dueDays <= 20) {

	            int fine = dueDays * 20;

	            System.out.printf("Fine: Rs. %d\n", fine);

	        } else if (dueDays >= 21 && dueDays <= 30) {

	            int fine = dueDays * 30;

	            System.out.printf("Fine: Rs. %d\n", fine);

	        } else if (dueDays > 30) {

	            System.out.println("Membership cancelled");

	        }

	        scanner.close();

	    }

}
