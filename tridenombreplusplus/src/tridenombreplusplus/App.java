package tridenombreplusplus;

import java.util.Scanner;

/*
 VARIABLES
 a est un réel
 b est un réel
 c est un réel
 
 DEBUT DU PROGRAMME
 Ecrire "Saisir un nombre a : "
 Lire a
 Ecrire "Saisir un nombre b : "
 Lire b
 Ecrire "Saisir un nombre c : "
 Lire c
 
 Si a < b
 	Si b < c
 		Ecrire a , "<" , b , "<" , c
 	Sinon // b <= a
 		Si a < c
 			Ecrire a , "<" , c , "<" , b
 		Sinon // c <= a
 			Ecrire c , "<" , a , "<" , b
 		Fin Si
 	Fin Si
 Sinon // b <= a
 	Si a < c
 		Ecrire b , "<" , a , "<" , c
 	Sinon // c <= a
 		Si b < c
 			Ecrire b , "<" , c , "<" , a
 		Sinon // c <= b
 			Ecrire c , "<" , b , "<" , a
 		Fin Si
 	Fin Si
 Fin Si
 
 FIN DU PROGRAMME
 
 */

public class App {
	
	public static void main(String[] args) {
		
		// DECLARATION DES VARIABLES
		double a;
		double b;
		double c;
		
		Scanner sc = new Scanner(System.in);
	
		// DEBUT PROGRAMME
		
		// Lecture des nombres
		System.out.println("Saisir un nombre a : ");
		a = sc.nextDouble();
		
		System.out.println("Saisir un nombre b : ");
		b = sc.nextDouble();
		
		System.out.println("Saisir un nombre c : ");
		c = sc.nextDouble();
		
		// Tests
		if (a < b) {
			if (b < c) {
				System.out.println(a + " < "+ b + " < " + c);
			}
			else { // c <= b
				if (a < c) {
					System.out.println(a + " < "+ c + " < " + b);
				}
				else { // c <= a
					System.out.println(c + " < "+ a + " < " + b);
				}
			}	
		}
		else { // b <= a
			if (a < c) {
				System.out.println(b + " < "+ a + " < " + c);
			}
			else { // c <= a
				if (b < c) {
					System.out.println(b + " < "+ c + " < " + a);
				}
				else { // c <= b
					System.out.println(c + " < "+ b + " < " + a);
					sc.close();
				}
			}
		}
	}
}