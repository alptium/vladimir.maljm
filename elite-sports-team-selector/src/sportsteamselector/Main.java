package sportsteamselector;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		String gun1 = "Automatic rifle";
		String gun2 = "Gun";
		String gun3 = "Sniper";
		
		System.out.println("Welcome to Air Soft club team selector");
		System.out.println("Please complete the following questionnaire...");
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter your Name: ");
			String name = sc.next();
			
			System.out.println("Enter your Surname: ");
			String surname = sc.next();
			
			System.out.println("Enter your age: ");
			int age= sc.nextInt();
			
			if (age < 18) {
				System.out.println( name + " you are young for this game. ");
				return;
			}
			
			System.out.println("Do you have a diopter? Y/N ");
			String diopter= sc.next();
			
			if (diopter.equals("Y") || diopter.equals("y")) {
				System.out.println("Please enter your dioptre: ");
				double diopterValue = sc.nextDouble();
				
				if (diopterValue >= 0.5 ) {
					System.out.println("We are sorry, you are not fulfilling criteria, your dioptre is to large. ");
					return;
				}
			}
			
			System.out.println("Do you have some heart problems? Y/N ");
			String heartProblems= sc.next();
			
			if ( heartProblems.equals("Y") || heartProblems.equals("y")) {
				System.out.println("We are sorry. This game is not allowed to play people with heart problems. ");
				return;
			}
			
			System.out.println("Are you a team player? Y/N ");
			String teamPlayer= sc.next();
			
			if (age >= 18 && age <= 35 && teamPlayer.equals("N") || teamPlayer.equals("Y")) {
				System.out.println("You can play with (1)" + gun1 + ", (2)" + gun2 + " and (3)" + gun3 + ". Choose ONE of the offered ones: ");
				int gunNo= sc.nextInt();
				
				if (gunNo == 1) {
					System.out.println( name + " your tactical position is OFFENCE. ");
				}
				
				else if (gunNo == 2) {
					System.out.println(name + " your tactical position is SUPORT. ");
				}
				
				else if (gunNo == 3) {
					System.out.println(name + " your tactical position is DEFENSE. ");
				}
				
			}
			else if (age > 35 && age <= 65 && teamPlayer.equals("N") || teamPlayer.equals("Y")) {
				System.out.println("You can play with (1)" + gun1 + "and (2)" + gun2 + ". Choose ONE of the offered ones: ");
				int gunNo= sc.nextInt();
				
				if (gunNo == 1) {
					System.out.println(name + " your tactical position is Commander. ");
				}
				
				else if (gunNo == 2) {
					System.out.println(name + " your tactical position is Deputy Commander. ");
				}
			}
			System.out.println("Congratulations! ");
			System.out.println("You are Accepted. ");

		}

	}

}
