package hemadharshini;
import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        
        double result;
        switch (choice) {
            case 1: 
                result = num1 + num2;
                System.out.println("Sum: " + result);
                break;

            case 2: 
                result = num1 - num2;
                System.out.println("Difference: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Product: " + result);
                break;

            case 4: 
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Quotient: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
                break;
        }

        
        scanner.close();
    }

}
