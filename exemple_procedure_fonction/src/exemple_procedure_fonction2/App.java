package exemple_procedure_fonction2;

import java.util.Scanner;

public class App {

	public static int addition(int nombre1, int nombre2)
	{
		int resultat;
		resultat= nombre1 + nombre2;
		
		return resultat;
	}
	
	public static void main(String[]args) {
		
		int a;
		int b;
		int c;
		int d;
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir le 1er nombre :");
		c = sc.nextInt();
		System.out.println("Veuillez saisir un 2em nombre");
		d = sc.nextInt();
		System.out.println("Veuillez saisir un 1er nombre");
		a = sc.nextInt();
		System.out.println("Veuillez saisir un 2em nombre");
		b = sc.nextInt();
		
		//system.out.println(addition(a,b));
		System.out.println("Le resultat de la 1ere addition est : "+addition(c,d));
		System.out.println("Le resultat de  la 2eme addition est : "+addition(a,b));

		sc.close();
	}
}
