package gradebook;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String studentsName[];
		String studentsSurname[];
		int grades[];
		int totalGrade = 0;
		int numberOfStudents = 0;
		
			try(Scanner sc = new Scanner(System.in)) {	 
		
				System.out.println("welcome Mrs James please enter the number of students in your class: ");
				numberOfStudents = sc.nextInt();
				studentsName = new String[numberOfStudents];
				studentsSurname = new String[numberOfStudents];
				grades = new int[numberOfStudents];
				
				for(int i = 0 ; i < numberOfStudents; i++) { 
			
					int k = i + 1; //zato sto brojac "i" pocinje od nule a brojac "k" treba da oznacava broj studenata kojih ima vise od nula
			
					System.out.println("Enter the name of your " + k + ". student: ");
					studentsName[i] = sc.next();
					
					System.out.println("Enter the surname of your " + k + ". student: ");
					studentsSurname[i] = sc.next();
			
					System.out.println("Enter his grade: ");
					grades[i]= sc.nextInt();
				}
				
				for(int i = 0 ; i < numberOfStudents; i++) { 
					
					System.out.println("Student " + studentsName[i] + " " + studentsSurname[i] + " "  + " has grade " + grades[i]);
					totalGrade += grades[i];
				}
				double averageGrade = totalGrade / numberOfStudents;
				System.out.println("Total grade of your students is: " + totalGrade);
				System.out.println("Average grade of your students is: " + averageGrade);
		}
	}
}
