package recherche_nombre_dans_tableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// DECLARATIONS

		int nombreRecherche;
		boolean trouve = false;
		int indice = 0;
		final int[] TABLEAU = { 0, 2, 3, 5, 8, 12, 17, 24, 25, 48 };
		Scanner sc = new Scanner(System.in);

		// DEBUT PROGRAMME
		System.out.println("PROGRAMME DE RECHERCHE DE VALEUR DANS UN TABLEAU\n");
		System.out.print("Veuillez entrer un nombre : ");
		nombreRecherche = sc.nextInt();
		System.out.println();
		while (indice < TABLEAU.length && !trouve) {
			if (TABLEAU[indice] == nombreRecherche) {
				trouve = true;
			} else {
				indice++;
			}
		}
		if (trouve) {

			System.out.println("Le nombre " + nombreRecherche + " est present a l'indice " + indice);
		} else {
			System.out.println("404 Not found ! lol :P");
		}
		// FIN PROGRAMME
		sc.close();
	}
}