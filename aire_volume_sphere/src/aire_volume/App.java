package aire_volume;

import java.util.Scanner;

/*
 * Variables
 * R est un entier
 * Aire est un reel double
 * Volume est un reel double
 * DEBUT DE PROGRAME
 * Ecrire " veuillez ecrire la valeur du rayon R
 * Lire R
 * Aire<-- 4 PI R²
 * Volume 4/3 PI R3
 * Ecrire " l'aire de la sphere est de "  + aire
 * Ecrire " LE volume de la sphere est de " + Volume 
 * FIN DE PROGRAMME 
 */

public class App {

	public static void main(String[] args) {
		
		// declaration de scanner
		Scanner Sc = new Scanner(System.in);
		
		// utilisation de l'objet pi de la classe java
		
		// DEBUT DE PROGRAMME
		double pi = Math.PI;
		double aire ;
		int rayon ;
		double volume ;
		
		// DEBUT DE PROGRAMME
		
		// utilisation de l'objet de pow( puissance) de la classe math (1er parametre de la variable le nombe,
	
		System.out.println("Programme de calcul de l'air d'une sphere");
		
		// on demande a l'utilisateur de saisir la valeur du rayon
		
		System.out.println("veuillez ecrire la valeur du rayon R");
		
		// on stock la valeur de la variable rayon
		
		rayon = Sc.nextInt();
		
		//on fait le calcul de volume et on stock le resultat dans la variable aire
		
		aire =4 * pi * (Math.pow( rayon, 2));
		
		System.out.println("l'air de la sphere est de :" + " " + aire );
	
		
		volume =   4 / 3 * pi *(Math.pow( rayon, 3))  ;
		
		// on affiche le resultat
		
		System.out.println("le volumer de la sphere est de :" + " " + volume );
		
		// FIN DE PROGRAMME
		Sc.close();
	}

}
