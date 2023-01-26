package annee_bisextille_fonction;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int annee;
		
		System.out.println("Veuiller saisir une annee");
	annee = sc.nextInt();
	anneeBisextil(annee);
	sc.close();
	
	}
	
	public static void anneeBisextil( int annee) {
		
		if (
				annee % 4 != 0 ||
				(annee % 100 == 0 && 
				annee % 400 != 0 )
			) {
			System.out.println("L'année "+annee+" n'est pas bisextile.");
		}
		
		else {
			System.out.println("L'année "+annee+ " est bisextile.");
		}
		
}
}



