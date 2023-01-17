package moyenne;

import java.util.Scanner;

public class App {

	/* 
 *  Variables
	 *  Nombre1 est un entier
	 *  Nombre2 est un entier
	 *  Moyenne est un reel
 *  Debut programme
	 *  Ecrire « Programme de calcul de la moyenne de 2 nombres » 
		
		Ecrire « Veuillez saisir un premier nombre » 
		
		Lire nombre1 
		
		Nombre1ß est un entier 
		
		Ecrire « Veuillez saisir un deuxième nombre » 
		
		Lire nombre2 
		
		Nombre2ß est un entier 
		
		Moyenneß(nombre1 + nombre2)/2 
		
		Moyenne est un reel double precision 
		
		Ecrire « La moyenne de » nombre1 « et » nombre2 « est » moyenne  
	Fin de programme
	 * 
	 * */
	public static void main(String[] args) {
		
		// Variables
		Scanner Sc = new Scanner(System.in);
		
		// debut de programe
		int nombre1;
		int nombre2;
		double moyenne;
		
		
		System.out.println("Programme de calcul de la moyenne de 2 nombres");
		
		System.out.println("Veuillez saisir un premier nombre");
		nombre1 = Sc.nextInt();
		System.out.println("vous avez saisi: " + nombre1);

		System.out.println("Veuillez saisir un second nombre");
		nombre2 = Sc.nextInt();
		System.out.println("vous avez saisi: " + nombre2);
		moyenne = (nombre1 + nombre2)/2 ;
		System.out.println("la moyenne est de :" + " " + moyenne );
	
		Sc.close();
		
	}

}
