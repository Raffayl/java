package air_perimetre_procedure;

import java.util.Scanner;

public class App {
	
	public static void calculPerimetreAireTriangle(int a, int b, int c)
	{
		double perimetre;
		double aire;
		
		perimetre = a + b + c;
		aire =Math.sqrt(perimetre*(perimetre-a)*(perimetre-b)*(perimetre-c));
		System.out.println("Le perimetre est : "+perimetre+" l'aire est : "+aire);
	}

	public static void main(String[] args) {
		
		int cotesA;
		int cotesB;
		int cotesC;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le cotes A : ");
		cotesA = sc.nextInt();
		System.out.println("Veuillez saisir le cotes B : ");
		cotesB = sc.nextInt();
		System.out.println("Veuillez saisir le cotes C : ");
		cotesC = sc.nextInt();
		
		calculPerimetreAireTriangle(cotesA,cotesB,cotesC);
		
		sc.close();
		
	}

}