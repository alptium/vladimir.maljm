package matrica;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
		System.out.println("Unesi broj redova matrice: ");
		int red = sc.nextInt();
		
		System.out.println("Unesi broj kolona matrice: ");
		int kolona = sc.nextInt();
		
		int matrica[][] = new int[red][kolona];		//definisanje niza /matrice
		
		for(int i = 0; i < red; i++) {			//petlja u kojoj se unose clanovi matrice
			for(int j = 0; j < kolona; j++) {
				System.out.println("X [" + i + "," + j + "] ---> ");
				matrica[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		for (int i = 0; i < red; i++) {			//petlja koja ispisuje matricu
            for (int j = 0; j < kolona; j++) {
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }
		System.out.println();
		
		for (int i = 0; i < red; i++) {			// petlja u kojoj se ispisuju nule na glavnoj dijagonali
            for (int j = 0; j < kolona; j++) {
                if (i == j) {
                	matrica[i][j] = 0 ;
                }
            	System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }
		System.out.println();
		
		for (int i = 0; i < red; i++) {			// petlja u kojoj se ispisuju nule iznad glavne dijagonale
            for (int j = 0; j < kolona; j++) {
                if (i < j) {
                	matrica[i][j] = 0 ;
                }
            	System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        
		}
		System.out.println();
		
		for (int i = 0; i < red; i++) {			// petlja u kojoj se ispisuju nule ispod g;avne dijagonale
            for (int j = 0; j < kolona; j++) {
                if (i > j) {
                	matrica[i][j] = 0 ;
                }
            	System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        
		}
		
		}
	}

}
