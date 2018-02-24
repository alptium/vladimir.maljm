package calculator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

				double firstNumber;
				double secondNumber;
				double result = 0;
				
					try(Scanner sc = new Scanner(System.in)) {
					
					System.out.println("Enter your first number");
					firstNumber = sc.nextInt();
					
					System.out.println("Choose your operation +, -, * ,/ ");
					String operation = sc.next();
					
					System.out.println("Enter your second number");
					secondNumber = sc.nextInt();
					
					if (operation.equals("/") && secondNumber == 0) {				
						
						System.out.println("Divide with 0 (zero) can't be calculated.");
					
						System.out.println("Enter your second number again: ");
			
						secondNumber = sc.nextInt();
					}
					else if(operation.equals("+")) {
						result = firstNumber + secondNumber;
					} 
					else if(operation.equals("-")) {
						result = firstNumber - secondNumber;
					} 
					else if(operation.equals("*")) {
						result = firstNumber * secondNumber;		
					} 
					else if(operation.equals("/")) {
						result = firstNumber / secondNumber;			
					}
					
					System.out.println("The result for " + firstNumber + " " + operation + " " + secondNumber + " is " + result);
		}
	}
}
