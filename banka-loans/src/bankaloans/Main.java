package bankaloans;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("==============*=============");
		System.out.println("Select the operation you want ");
		System.out.println("==============*=============");
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Do you want to add new client? (Yes/No) ");
			String a1= sc.next().substring(0, 1);
			
			if(a1.equalsIgnoreCase("y")) {
				runAddClient();
			} else if(a1.equalsIgnoreCase("n")) {
				
				System.out.println("Do you want to add new loan? (Yes/No) ");
				String a2= sc.next().substring(0, 1);
				
				if(a2.equalsIgnoreCase("y")) {
					runAddLoan();
				} else {
					runLoanSelect();
				}
			}
		}
	}

	
	private static void runAddClient() {
		while(true) {
			
			DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy");
			LocalDateTime now = LocalDateTime.now();
			int dateNow = Integer.parseInt(date.format(now));
			int age = 0;
			
			try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter client name: ");
			String firstName = sc.next();
			
			System.out.println("Enter client surname: ");
			String lastName = sc.next();
			
			System.out.println("Enter client birth date : ");
			int birthDate = sc.nextInt();
			
			System.out.println("Enter client birth month : ");
			int birthMonth = sc.nextInt();
			
			System.out.println("Enter client birth year : ");
			int birthYear = sc.nextInt();
			age = dateNow - birthYear;
			
			System.out.println("Please enter client JMBG: ");
			String jmbg = sc.next();
					
			while(jmbg.length() != 13) { 
				System.out.println("Please enter VALID client JMBG: ");
				jmbg = sc.next();
			}
			
			System.out.println("Enter client marital status: (Married / Not married) ");
			String maritalStatus = sc.next().substring(0, 1);
			
			System.out.println("Enter client employement status: (Employed / Unemployed)");
			String employementStatus = sc.next().substring(0, 1);
			
			Client client = new Client (firstName, lastName, birthDate, birthMonth, birthYear, jmbg, maritalStatus, employementStatus);
			
			System.out.println("Do you want to add more clients? (Yes/No)");
			String a1= sc.next().substring(0, 1);
			if(a1.equalsIgnoreCase("y")) {
				continue;
			}
			
			}
		}
	}
	
	private static void runLoanSelect() {
		
		ArrayList<Client> listApproved = new ArrayList<>();
		ArrayList<Client> listNotApproved = new ArrayList<>();
		
	}
	
	private static void runAddLoan() {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			
			System.out.println("Enter loan name: ");
			String loanName = sc.next();
			
			System.out.println("Enter loan ID: ");
			int loanID = sc.nextInt();
			
			System.out.println("Enter loan amount: ");
			int loanAmount = sc.nextInt();
			
			System.out.println("Enter loan period: ");
			int loanPeriod = sc.nextInt();
			
			System.out.println("Enter nominal interest rate: ");
			int nomInterestRate = sc.nextInt();
			
			System.out.println("Enter montly annuity: ");
			int montlyAnnuity = sc.nextInt();
			
			System.out.println("Enter bank fee: ");
			int bankFee = sc.nextInt();
			
			Loan loan = new Loan (loanName, loanID, loanAmount, loanPeriod, nomInterestRate, montlyAnnuity, bankFee);
			
		}
	}

}