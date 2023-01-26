package invertion_avec_procedure;

import java.util.Scanner;
public class App
{ 
	public static void main(String[] args)
	{ 
		Scanner sc = new Scanner(System.in);
		
	// Demande des deux nombres à l'utilisateur
		
		System.out.print("Entrez le premier nombre : ");
		int num1 = sc.nextInt();
		System.out.print("Entrez le deuxième nombre : ");
		int num2 = sc.nextInt();
		
		// Appel de la procédure pour inverser les deux nombres
		
		inverserNombres(num1, num2);
		sc.close();
		}
	public static void inverserNombres(int num1, int num2)
		{
			
			// Inversion des deux nombres 
			
			int temp = num1;
			num1 = num2;
			num2 = temp; 
			
			// Affichage des deux nombres inversés 
			
			System.out.println("Le premier nombre inverse est : " + num1);
			System.out.println("Le deuxième nombre inverse est : " + num2);
		
		} 
		
	}
