package sportsteamselector;

import java.util.Scanner;

public class Reader {
	public static Candidate readCandidate(Scanner sc) {
		System.out.println("Enter your Name: ");
		String name = sc.next();
		
		System.out.println("Enter your Surname: ");
		String surname = sc.next();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		return new Candidate(name, surname, age);
	}
}
