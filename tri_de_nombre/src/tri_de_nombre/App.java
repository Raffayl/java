package tri_de_nombre;


import java.util.Scanner;
/*
 VARIABLES
 	a est un entier
 	b est un entier
 DEBUT DU PROGRAMME
 
 	afficher "donnez un premier nombre"
 	lire a
 	afficher "donnez un deuxieme nombre"
 	lire b
 	
 	DEBUT SI
 		SI a > b
 		ALORS	
 			afficher b puis a
 		SINON 
 			afficher a puis b
 	FIN SI
 	
 FIN DU PROGRAMME
 */


public class App {

	public static void main(String[] args) {
		int a;
		int b;
		 
		Scanner sc = new Scanner (System.in);
		//Début du programme
		
		System.out.println ("Tri de nombres");
		
		System.out.println ("indiquer le nombre a");
		
		a = sc.nextInt();
		
		System.out.println ("indiquerle nombre b");
		
		b = sc.nextInt();
		
		if (a > b)
		{
			System.out.println(b +" , "+a);
		
		}
		else
		{
			System.out.println(a+" , "+b);
		}
		 sc.close ();


	}

}
