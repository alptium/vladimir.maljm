package bankaloans;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("==============*==============");
		System.out.println("Select the operation you want ");
		System.out.println("==============*==============");
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Do you want to add new client? (Y/N) ");
			String a1= sc.next().substring(0, 1);
			
			if ( a1.equalsIgnoreCase("y") ) {
				runDemoAddClient();
			}
			else if (a1.equalsIgnoreCase("n") ) {
				System.out.println("Do you want to add new loan? (Y/N) ");
				String a2= sc.next().substring(0, 1);
				
				if ( a2.equalsIgnoreCase("y") ) {
					runDemoAddLoan();
				}
			}
		}
	}

	
	private static void runDemoAddClient() {
		
	}
	
	private static void runDemoAddLoan() {
		
	}

}