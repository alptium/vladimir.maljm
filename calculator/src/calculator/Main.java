package calculator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int result = 0;
		try (Scanner scenner = new Scanner(System.in)) {
				
			System.out.println("Enter your first number");
			int firstNumber = scenner.nextInt();
			
			
			
			System.out.println("Choose your operation +, -, * ,/ ");
			String operation = scenner.next();
			
			if(operation !=  "+" || operation !=  "-" || operation !=  "*" || operation !=  "/") {
				System.out.println("You enter wrong operation, please enter it again ");
				operation = scenner.next();
			}
				
			System.out.println("Enter your second number");
			int secondNumber = scenner.nextInt();
			
			if(operation.equals("/") && secondNumber == 0) {				
				System.out.println("Divide with 0 (zero) can't be calculated.");
				System.out.println("Enter your second number again: ");
				secondNumber = scenner.nextInt();
			} else if(operation.equals("+")) {
				result = firstNumber + secondNumber;
			} else if(operation.equals("-")) {
				result = firstNumber - secondNumber;
			} else if(operation.equals("*")) {
				result = firstNumber * secondNumber;		
			} else if(operation.equals("/")) {
				result = firstNumber / secondNumber;			
			}
			System.out.println("The result for " + firstNumber + " " + operation + " " + secondNumber + " is " + result);
		}
	}
}
