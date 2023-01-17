package interet;

import java.util.Scanner;

public class interet {

	public static void main(String[] args) {
		 
		// instancier la classe
		Scanner Sc = new Scanner(System.in);
			
		
		// declaration de variable		
								
				double somme ;
				double interet ;
				int annee ;
				double interetsimple;
				double interetcomposé;
				
				// DEBUT DE PROGRAMME 
				
		System.out.println("Programme de calcul d'interet");
		// on demande a l'utilisateur de saisir la valeur de la somme placée
		System.out.println("veuillez ecrire la valeur de la somme placée");
		// on stock la valeur de la variable somme
		somme = Sc.nextDouble();
		System.out.println("veuillez ecrire la valeur des interets");
		// on stock la valeur de la variable interets
		interet = Sc.nextDouble();
		// on demande a l'utilisateur de rentré le nombre d'annee
		System.out.println("veuillez ecrire la valeur des nombres d'anées ");
		// on stock la valeur de la variable annee
		annee = Sc.nextInt();
		//calcul interet simple
		interetsimple = somme * (1+ annee * interet/100);
		//resultat
		System.out.println("l'interet simple est "+ " " + interetsimple);
		//calcul interet composé
		interetcomposé = somme* Math.pow((1+ interet/100),annee);
		System.out.println("l'interet composé est de "+ " " + interetcomposé);
		
		
		//fin
		Sc.close();
	}
}
