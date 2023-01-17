package fruitsEtLegumes;

import java.util.Scanner;
import java.util.HashMap;

public class App {
	public static void main(String[] args) {
		HashMap<String, Double> listeLegumes = new HashMap<String, Double>();
		Scanner sc = new Scanner(System.in);
		{

			while (true) {
				System.out.print("Entrez un legume et son prix  ou 'go' pour terminer: ");
				String input = sc.nextLine();
				if (input.equals("go")) {
					break;
				}
				String[] parts = input.split(" ");
				String legume = parts[0];
				double prix = Double.parseDouble(parts[1]);
				listeLegumes.put(legume, prix);
			}

			double prixLePlusBas = Double.MAX_VALUE;
			String legumeLePlusBas = "";
			for (String legume : listeLegumes.keySet()) {
				double prix = listeLegumes.get(legume);
				if (prix < prixLePlusBas) {
					prixLePlusBas = prix;
					legumeLePlusBas = legume;
				}
				System.out.println("1 kilogramme de " + legume + " coute " + prix + " euros.");
			}

			System.out.println("Légume le moins cher au kilo : " + legumeLePlusBas);
		}
	
		
		sc.close();
	}
}