package tableau_exo1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// declaration d'un tableau de chaine de caractère contenant les prènoms
		String[] tableau = new String[] {"Olivier", 
										"Mickael", 
										"Stephan",
										"Adeline",
										"Raphael",
										"Florian",
										"Kevin",
										"Natana",
										"Frederic",
										"Samba",
										"Terence",
										"Mustapha"};

		Scanner sc = new Scanner(System.in);
		// declaration des variables
		int choix;
		String resultat = "";
		boolean trouver = false;

		System.out.println("Quel est votre numero :");
		choix = sc.nextInt();

		// boucle for pour rechercher l'indice du prènom selon le choix de l'utilisateur
		for(int i = 0; i < tableau.length ; i++)
		{
			// si le choix de l'utilisateur correspond à l'indice+1(car un tableau commence à zero)
			if(choix == i+1)
			{
				// on stocke dans la variable resultat le prènom correspondant
				resultat = "Bonjour " + tableau[i];
				// et on passe le boolean trouver à true
				trouver = true;
			}

		}

		// si trouver est vrai
		if(trouver)
		{
			// alors on affiche le resultat
			System.out.println( resultat);
		}
		else
		{
			// sinon on affiche le message d'erreur
			System.out.println("Error 404 not found");
		}

		sc.close();
	}

}