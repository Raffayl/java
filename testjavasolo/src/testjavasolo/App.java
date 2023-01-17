package testjavasolo;

import java.util.Scanner;
// importation de la classe java.util.Scanner

public class App {

	public static void main(String[] args)
	{
		Scanner scanner;
		String nom ;
		int age ;
		
		scanner = new  Scanner(System.in); 
		// creation d'un nouveau scanner
	
		System.out.println("Saisissez votre nom : ");
		
		nom = scanner.nextLine();
		// lit la ligne entière
		
		System.out.println("Merci " + nom + ".");
		
		do {
			System.out.println("saisissez votre age : ");
			 // l'utilisateur doit saisir un nombr entier
			age = scanner.nextInt();
		}
		while(age< 0); 
		// si l'age est inferieur a 0, on recommence
		
		System.out.println("merci " + nom + ". vous avez " + age + " an(s).");
		
		if(age >= 18) {
			System.out.println("Vous etes majeur");
		}
		else {
			System.out.println("vous etes mineur");
		}
	
		scanner.close();
	}
}
