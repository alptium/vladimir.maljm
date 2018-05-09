package sportsteamselector;

import java.util.Scanner;

public class Processor {

	private static String gun1 = "Automatic rifle";
	private static String gun2 = "Gun";
	private static String gun3 = "Sniper";
	
	public static boolean process(Scanner sc, Candidate candidate) {
		if(!processAge(sc, candidate)) {
			return false;
		}
		
		if(!processDiopter(sc, candidate)) {
			return false;
		}
		
		if(!processHeartProblems(sc, candidate)) {
			return false;
		}
		
		if(!processAcceptance(sc, candidate)) {
			return false;
		}
		
		return true;
	}
	
	private static boolean processAge(Scanner sc, Candidate candidate) {
		String name = candidate.getName();
		int age = candidate.getAge();
		
		if(!Validator.validateAge(age)) {
			System.out.println(name + " you are young for this game. ");
			return false;
		}
		
		return true;
	}
	
	private static boolean processDiopter(Scanner sc, Candidate candidate) {
		String name = candidate.getName();
		
		System.out.println("Do you have a diopter? Y/N ");
		String diopter= sc.next();
		
		if(diopter.equalsIgnoreCase("Y")) {
			System.out.println("Please enter your dioptre: ");
			double diopterValue = sc.nextDouble();
			
			if(!Validator.validateDiopter(diopterValue)) {
				System.out.println(name + ", we are sorry, you are not fulfilling criteria, your dioptre is to large. ");
				return false;
			}
		}
		
		return true;
	}
	
	private static boolean processHeartProblems(Scanner sc, Candidate candidate) {
		String name = candidate.getName();
		
		System.out.println("Do you have some heart problems? Y/N ");
		String heartProblems= sc.next();
		
		if(!Validator.validateHeartProblems(heartProblems)) {
			System.out.println(name + ", we are sorry. This game is not allowed to play people with heart problems. ");
			return false;
		}
		
		return true;
	}
	
	private static boolean processAcceptance(Scanner sc, Candidate candidate) {
		String name = candidate.getName();
		String surname = candidate.getSurname();
		int age = candidate.getAge();
		
		boolean isAccepted = false;
		
		if(Validator.isJunior(age)) {
			System.out.println("You can play with (1)" + gun1 + ", (2)" + gun2 + " and (3)" + gun3 + ". Choose ONE of the offered ones: ");
			int gunNo= sc.nextInt();
			
			switch(gunNo) {
				case 1: System.out.println(name + " your tactical position is OFFENCE. ");
					break;
				case 2: System.out.println(name + " your tactical position is SUPORT. ");
					break;
				case 3: System.out.println(name + " your tactical position is DEFENSE. ");
					break;
			}
			
			isAccepted = true;
			
		} else if(Validator.isSenior(age)) {
			System.out.println("You can play with (1)" + gun1 + "and (2)" + gun2 + ". Choose ONE of the offered ones: ");
			int gunNo= sc.nextInt();
			
			switch(gunNo) {
				case 1: System.out.println(name + " your tactical position is Commander. ");
					break;
				case 2: System.out.println(name + " your tactical position is Deputy Commander. ");
					break;
			}
			
			isAccepted = true;
		}
		
		if(isAccepted) {
			System.out.println("Congratulations " + name + " " + surname + " !");
			System.out.println("You are Accepted. ");
		} else {
			System.out.println("Sorry " + name + " " + surname + " !");
			System.out.println("You are rejected. ");
		}
		
		return isAccepted;
	}
}
