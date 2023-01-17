package surface;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Sc = new Scanner(System.in);
		
		// Déclaration

		double pi = Math.PI;

		int rayon;

		double angle;

		double surfacesecteur;

		// Debut

		// Initialisation 

		System.out.println("Veuillez saisir un rayon");

		rayon = Sc.nextInt();
		 
		System.out.println("Veuillez saisir un angle");

		angle = Sc.nextInt();

		// Calcul

		surfacesecteur =( pi * (Math.pow(rayon, 2)) * angle) / 360;

		// Resultat

		System.out.println("La surface du secteur est de: " + surfacesecteur);

		// Fin
		Sc.close();
	}

}
