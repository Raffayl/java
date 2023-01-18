package recherche_de_lettre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// VARIABLES

		String chaine;
		char lettre;
		int occurrence = 0;
		char[] tableau_chaine;
		int i = 0;

		Scanner sc = new Scanner(System.in);

		// DEBUT PROGRAMME

		System.out.println("saisir une chaine de charactere qui se termine par un point");
		chaine = sc.nextLine();

		tableau_chaine = chaine.toCharArray();
		System.out.println(tableau_chaine[1]);

		System.out.println("saisir une lettre");
		lettre = sc.nextLine().charAt(0);

		if (tableau_chaine.length == 0 || tableau_chaine.length == 1 && tableau_chaine[0] == '.') {
			System.out.println("LA CHAINE EST VIDE");
		} else if (tableau_chaine[tableau_chaine.length - 1] != '.') {
			System.out.println("LA CHAINE NE FINIT PAS PAR UN POINT");
		} else {
			while (tableau_chaine[i] != '.') {
				if (tableau_chaine[i] == lettre) {
					occurrence++;
				}
				i++;
			}

			System.out.println(lettre + " A " + occurrence + " OCCURENCE(S)");
		}

		// FIN PROGRAMME
		sc.close();
	}

}