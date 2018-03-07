package gradebook;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String students[];
		int grades[];
		int totalGrade = 0;
		int numberOfStudents = 0;
		
			try(Scanner sc = new Scanner(System.in)) {	 
		
				System.out.println("welcome Mrs James please enter the number of students in your class: ");
				numberOfStudents = sc.nextInt();
				students = new String[numberOfStudents];
				grades = new int[numberOfStudents];
				
				for(int i = 0 ; i < numberOfStudents; i++){ 
			
					int k = i + 1; //zato sto brojac "i" pocinje od nule a brojac "k" treba da oznacava broj studenata kojih ima vise od nula
			
					System.out.println("Enter the name and surname of your " + k + ". student: ");
					students[i] = sc.next();
			
					System.out.println("Enter the grade: ");
					grades[i]= sc.nextInt();
				}
				
				for(int i = 0 ; i < numberOfStudents; i++){ 
					
					System.out.println("Student " + students[i] + " " + " has grade " + grades[i]);
					totalGrade += grades[i];
				}
				double averageGrade = totalGrade / numberOfStudents;
				System.out.println("Total grade of your students is: " + totalGrade);
				System.out.println("Middle grade of your students is: " + averageGrade);
			}
	}

}
