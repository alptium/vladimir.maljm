package sportsteamselector;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Air Soft club team selector");
		System.out.println("Please complete the following questionnaire...");
		
		try(Scanner sc = new Scanner(System.in)) {
			
			while(true) {
				Candidate candidate = Reader.readCandidate(sc);
				
				if(!Processor.process(sc, candidate)) {
					return;
				}
				
				if(JOptionPane.showInputDialog("Do you want to add more people? Y/N ").equalsIgnoreCase("N")) {
					System.out.println("Thank you.");
					System.out.println();
					break;
				}
			}
		}
	}
}
