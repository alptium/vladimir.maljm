package bankaloans;

import java.util.Scanner;
import javafx.*;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("==============*==============");
		System.out.println("Select the operation you want ");
		System.out.println("==============*==============");
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Do you want to add new client? (Y/N) ");
			String a1= sc.next().substring(0, 1);
			
			if(a1.equalsIgnoreCase("y")) {
				runAddClient();
			}
			else if(a1.equalsIgnoreCase("n")) {
				System.out.println("Do you want to add new loan? (Y/N) ");
				String a2= sc.next().substring(0, 1);
				
				if(a2.equalsIgnoreCase("y")) {
					runAddLoan();
				}
			}
		}
	}

	
	private static void runAddClient() {
		while(true) {	
			Client client = new Client (/*firstName, secondName, birthDate, birthMonth, birthYear, jmbg, maritalStatus, employementStatus*/);
			
			try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter client name: ");
			client.setfirstName(sc.next());
			
			System.out.println("Enter client surname: ");
			client.setlastName(sc.next());
			
			System.out.println("Enter client birth date : ");
			client.setbirthDate(sc.nextInt());
			
			System.out.println("Enter client birth month : ");
			client.setbirthMonth(sc.nextInt());
			
			System.out.println("Enter client birth year : ");
			client.setbirthYear(sc.nextInt());
					
			do { 
				System.out.println("Please enter client JMBG: ");
				client.setjmbg(sc.next());
			} while(client.getjmbg().length() != 13);
			
			System.out.println("Enter client marital status: (Married / Not married) ");
			client.setmaritalStatus(sc.next().substring(0, 1));
			
			System.out.println("Enter client employement status: (Employed / Unemployed)");
			client.setemployementStatus(sc.next().substring(0, 1));
			
			System.out.println("Do you want to add more clients? (Y/N)");
			String a1 = sc.next();
			if(a1.equalsIgnoreCase("y")) {
				continue;
			}
			}
		}
	}
	
	private static void runAddLoan() {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			Loan loan = new Loan();
			
			System.out.println("Enter loan name: ");
			loan.setLoanName(sc.next());
			
			System.out.println("Enter loan ID: ");
			loan.setLoanID(sc.nextInt());
			
			System.out.println("Enter loan amount: ");
			loan.setLoanAmount(sc.nextInt());
			
			System.out.println("Enter loan period: ");
			loan.setLoanPeriod(sc.nextInt());
			
			System.out.println("Enter nominal interest rate: ");
			loan.setNomInterestRate(sc.nextInt());
			
			System.out.println("Enter montly annuity: ");
			loan.setLoanAmount(sc.nextInt());
			
			System.out.println("Enter bank fee: ");
			loan.setBankFee(sc.nextInt());
			
		}
	}

}