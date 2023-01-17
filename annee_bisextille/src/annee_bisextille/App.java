package annee_bisextille;

/*
 VARIABLES
 annee est un entier
 DEBUT DU PROGRAMME
 
 écrire "veuillez saisir l'année"
 lire année
 
 Si (annee mod 4 != 0 et annee mod 100 == 0 et annee mod 400 != 0)
 	alors ecrire " L'année", annee, " n'est pas bisextile
 	
 Sinon 
 écrire " L'année " , annee, "est bisextile"
 
 FIN DU PROGRAMME
 
 */

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclare les variables
		
		int annee;
		
		Scanner sc = new Scanner(System.in);
		
		// Ecrire lire l'année
		
		System.out.println("Veuillez saisir l'année : ");
		
		annee = sc.nextInt();
		
		System.out.println("Vous avez saisi l'année"+annee);
		
		
		// Déterminer si l'année est bixestile
		
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
		sc.close();
	}

}