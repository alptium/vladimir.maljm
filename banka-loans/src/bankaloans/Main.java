package bankaloans;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("=============================================");
		System.out.println("Select the operation you want ");
		System.out.println("=============================================");
		
		try(Scanner sc = new Scanner(System.in)) {
			
			String loanName1 = "Cash loan";
			int loanID1 = 01;
			double loanAmount1 = 100000.00;
			int loanPeriod1 = 24;
			double nomInterestRate1 = 2.1;
			double montlyAnnuity1 = 4166.66;
			double bankFee1 = 100;
			
			String loanName2 = "Car loan";
			int loanID2 = 02;
			double loanAmount2 = 900000.00;
			int loanPeriod2 = 48;
			double nomInterestRate2 = 6.1;
			double montlyAnnuity2 = 18750.00;
			double bankFee2 = 1000;
			
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
					loanAplication();
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
			
			System.out.println("W");
			
			System.out.println("Do you want to add more clients? (Yes/No)");
			String a1= sc.next().substring(0, 1);
			if(a1.equalsIgnoreCase("y")) {
				continue;
			} else {
				break;
			}
			
			}
		}
	}
	
	private static void loanAplication() {
		
		//ArrayList<Client> approved = new ArrayList<>();
		//ArrayList<Client> notApproved = new ArrayList<>();
		
	}
	
	private static void runAddLoan() {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			
			System.out.println("Enter loan name: ");
			String loanName = sc.next();
			
			System.out.println("Enter loan ID: ");
			int loanID = sc.nextInt();
			
			System.out.println("Enter loan amount: ");
			double loanAmount = sc.nextDouble();
			
			System.out.println("Enter loan period: ");
			int loanPeriod = sc.nextInt();
			
			System.out.println("Enter nominal interest rate: ");
			double nomInterestRate = sc.nextDouble();
			
			System.out.println("Enter montly annuity: ");
			double montlyAnnuity = sc.nextDouble();
			
			System.out.println("Enter bank fee: ");
			double bankFee = sc.nextDouble();
			
			Loan loan = new Loan (loanName, loanID, loanAmount, loanPeriod, nomInterestRate, montlyAnnuity, bankFee);
			
		}
	}

}