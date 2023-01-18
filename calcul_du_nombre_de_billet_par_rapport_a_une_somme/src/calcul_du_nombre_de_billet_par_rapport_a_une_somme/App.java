package calcul_du_nombre_de_billet_par_rapport_a_une_somme;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int euro500=0,euro200=0,euro100=0,euro50=0,euro20=0,euro10=0,euro5=0,euro2=0,euro1=0;
		int nombre = 0;
		Scanner clavier = new Scanner(System.in);
		
		while (nombre<1) {
		System.out.println("placer une valeur");
		nombre = clavier.nextInt();
		}
		do {
			if(nombre>=500) {
				euro500++;
				nombre-=500;
			}
			else if(nombre>=200) {
					nombre-=200;
					euro200++;
			}
			else if (nombre>=100) {
					nombre-=100;
					euro100++;
			}
			else if (nombre>=50) {
					euro50++;
					nombre-=50;
				}
			else if (nombre>=20) {
					euro20++;
					nombre-=20;
				}
			else if (nombre>=10) {
					euro10++;
					nombre-=10;
				}
			else if (nombre>=5) {
					euro5++;
					nombre-=5;
				}
			else if (nombre>=2) {
					euro2++;
					nombre-=2;
				}
			else if (nombre>=1) {
					euro1++;
					nombre-=1;
				}
		}
		while (nombre>0);
		System.out.println("500 € :"+euro500);
		System.out.println("200 € :"+euro200);
		System.out.println("100 € :"+euro100);
		System.out.println("50 € :"+euro50);
		System.out.println("20 € :"+euro20);
		System.out.println("10 € :"+euro10);
		System.out.println("5 € :"+euro5);
		System.out.println("2 € :"+euro2);
		System.out.println("1 € :"+euro1);
		
		clavier.close();
	
	}
}
