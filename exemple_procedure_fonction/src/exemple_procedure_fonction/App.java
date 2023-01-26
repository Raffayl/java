package exemple_procedure_fonction;

import  java.util.Scanner;

public class App {

		//procedure qui ne prend aucun argumen
	public static void disBonjour()
	{
		System.out.println("bonjour !!!");
	}
	
	//procedure qui prend en argument une chaine de caractere
	public static void disBonjourPrenom(String prenom)
	{
		System.out.println("Bonjour"+prenom);
		
	}
	public static void main (String[]args) {
		
		String saisie;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre prenom :");
		saisie = sc.nextLine();
		
		// appel de la procedure sans arguments
		disBonjour();
		
		//appel de la procedure avec l'argument de chaine de caractere
		disBonjourPrenom(saisie);
	
		sc.close();
	}
	
	
}
