package exo_garage;

public class App {
public static void main(String[] arg) {
		
		PorteDeGarage abcd = new PorteDeGarage(); // déclarer porte par défaut
		
		PorteDeGarage crm = new PorteDeGarage("CRM", 0, 90, 0, false); // Construire une porte
		
		String printAbcd = abcd.toString(); // afficher état porte par défaut
		String printCrm = crm.toString(); // afficher état porte construite
		System.out.println(printAbcd);
		System.out.println(printCrm);
		
		// test ouverture partielle	
		Boolean ouvertPartielAbcd = abcd.partiellementOuverte();
		System.out.println(ouvertPartielAbcd);
		Boolean ouvertPartielCrm = crm.partiellementOuverte() ; 
		System.out.println(ouvertPartielCrm);
		
		// test verrouiller
		Boolean verrou = crm.verrouiller();
		System.out.println(verrou);
		
		// test ouvrir (avec paramètre)
		Boolean aReussiAOuvrir = crm.ouvrir(25);
		System.out.println(aReussiAOuvrir); 
		System.out.println(crm);
		
		Boolean aReussiAFermer = crm.fermer(-45);
		System.out.println(aReussiAFermer);
		System.out.println(crm);
		
		Boolean areussiaverouiller = crm.verrouiller();
		System.out.println(areussiaverouiller);
		
		Boolean areussiadeverouiller = crm.unlock();
		System.out.println(areussiadeverouiller);
		
		

		

	}

}