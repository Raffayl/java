package evaluation_correction;

//Importation de la classe Scanner
import java.util.Scanner;

public class App {
	
		//Définir la fonction principale
	public static void main(String[] args) {
		
		//Créer un objet de type Scanner pour récupérer les entrées utilisateur
		Scanner sc = new Scanner(System.in);
		
		//Déclarer une variable "mois"
		int mois;
		
		////Déclarer un tableau "joursdanslemois" contenant les nombres de jours de chaque mois
		int[] joursdanslemois = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		do {
			
			System.out.print("Entrez un numéro de mois de 1 a 12): ");
			mois = sc.nextInt();
			
			//Déclarer un tableau "nomdumois" contenant les noms des mois
			String[] nomdumois = new String[12];
			nomdumois[0] = "janvier";
			nomdumois[1] = "fevrier";
			nomdumois[2] = "mars";
			nomdumois[3] = "avril";
			nomdumois[4] = "mai";
			nomdumois[5] = "juin";
			nomdumois[6] = "juillet";
			nomdumois[7] = "aout";
			nomdumois[8] = "septembre";
			nomdumois[9] = "octobre";
			nomdumois[10] = "novembre";
			nomdumois[11] = "decembre";

			System.out.println("Le mois sélectionné est : " + nomdumois[mois - 1]);	
		}
		//Faire une boucle pour répéter les étapes suivantes :
		while (mois < 1 || mois > 12);

		/*Si le mois saisi est pair :
		Afficher "Nombres de jours impairs :"
		Faire une boucle pour parcourir les jours du mois saisi
		Si le jour est impair, l'afficher
		 */
		
		if (mois % 2 == 0) {
			System.out.print("Nombres de jours impairs: ");
			for (int i = 1; i <= joursdanslemois[mois - 1]; i++) {
				if (i % 2 != 0) {
					System.out.print(i + " ");
				}
			}
                 /*Sinon (si le mois saisi est impair) :
				   Afficher "Nombres de jours pairs (sauf ceux qui se terminent par 0) :"
				   Faire une boucle pour parcourir les jours du mois saisi
			       Si le jour est pair et ne se termine pas par 0, l'afficher
                */
		} else {
			System.out.print("Nombres de jours pairs (sauf ceux qui se terminent par 0): ");
			for (int i = 1; i <= 31; i++) {
				if (i % 2 == 0 && i % 10 != 0) {
					System.out.print(i + " ");
				}
			}
		}
		sc.close();
	}
}