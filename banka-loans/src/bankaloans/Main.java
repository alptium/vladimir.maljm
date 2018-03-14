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
		
		try(Scanner sc = new Scanner(System.in)) {
		
		System.out.println("Enter client name: ");
		String firstName = sc.next();
		
		System.out.println("Enter client surname: ");
		String secondName = sc.next();
		
		System.out.println("Enter client birth date : ");
		int birthDate = sc.nextInt();
		
		System.out.println("Enter client birth month : ");
		int birthMonth = sc.nextInt();
		
		System.out.println("Enter client birth year : ");
		int birthYear = sc.nextInt();
		
		System.out.println("Enter client JMBG: ");
		String jmbg = sc.next();
		
		System.out.println("Enter client marital status: ");
		String maritalStatus = sc.next();
		
		System.out.println("Enter client employement status: ");
		String employementStatus = sc.next();
		
		Client client = new Client (firstName, secondName, birthDate, birthMonth, birthYear, jmbg, maritalStatus, employementStatus); 
	
		}
	}
	
	private static void runDemoAddLoan() {
		
		try(Scanner sc = new Scanner(System.in)) {
			
		}
	}

}