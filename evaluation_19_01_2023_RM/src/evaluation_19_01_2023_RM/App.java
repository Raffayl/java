package evaluation_19_01_2023_RM;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int mois;

		int[] joursdanslemois = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		{

			System.out.print("Entrez un numéro de mois de 1 a 12): ");
			mois = sc.nextInt();

			String[] nomdumois = new String[12];
			nomdumois[0] = "janvier";
			nomdumois[1] = "fevrier";
			nomdumois[2] = "mars";
			nomdumois[3] = "avril";
			nomdumois[4] = "mai";
			nomdumois[5] = "juin";
			nomdumois[6] = "juillet";
			nomdumois[7] = "aout";
			nomdumois[8] = "septembre";
			nomdumois[9] = "octobre";
			nomdumois[10] = "novembre";
			nomdumois[11] = "decembre";

			System.out.println("Le mois sélectionné est : " + nomdumois[mois - 1]);
		}

		while (mois < 1 || mois > 12)
			;

		if (mois % 2 == 0) {
			System.out.print("Nombres de jours impairs: ");
			for (int i = 1; i <= joursdanslemois[mois - 1]; i++) {
				if (i % 2 != 0) {
					System.out.print(i + " ");
				}
			}

		} else {
			System.out.print("Nombres de jours pairs (sauf ceux qui se terminent par 0): ");
			for (int i = 1; i <= 31; i++) {
				if (i % 2 == 0 && i % 10 != 0) {
					System.out.print(i + " ");
				}
			}
		}
		sc.close();
	}
}
