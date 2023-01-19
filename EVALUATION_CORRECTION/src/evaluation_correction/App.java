package evaluation_correction;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mois;
		int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		do {
			System.out.print("Entrez un numéro de mois (1-12): ");
			mois = sc.nextInt();
			String[] monthNames = new String[13];
			monthNames[0] = "raté";
			monthNames[1] = "janvier";
			monthNames[2] = "fevrier";
			monthNames[3] = "mars";
			monthNames[4] = "avril";
			monthNames[5] = "mai";
			monthNames[6] = "juin";
			monthNames[7] = "juillet";
			monthNames[8] = "aout";
			monthNames[9] = "septembre";
			monthNames[10] = "octobre";
			monthNames[11] = "novembre";
			monthNames[12] = "decembre";
			System.out.println("Le mois sélectionné est : " + monthNames[mois - 1]);
		} while (mois < 1 || mois > 13);

		if (mois % 2 == 0) {
			System.out.print("Nombres de jours impairs: ");
			for (int i = 1; i <= daysInMonth[mois - 1]; i++) {
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