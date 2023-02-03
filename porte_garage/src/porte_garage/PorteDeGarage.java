package porte_garage;

public class PorteDeGarage {

	private String nom;
	private String couleurDeLaPorte;
	private String typeDePorte;
	private boolean verouiller;
	private boolean porteOuverte;

	// le constructeur classique
	public PorteDeGarage(String nom, String couleurDeLaPorte, String typeDePorte, boolean verouiller,
			boolean porteOuverte) {
		this.nom = nom;
		this.couleurDeLaPorte = couleurDeLaPorte;
		this.typeDePorte = typeDePorte;
		this.verouiller = verouiller;
		this.porteOuverte = porteOuverte;
	}

	public String DonneLeNom() {
		return nom;
	}

	public String DonneLaCouleur() {
		return couleurDeLaPorte;
	}

	public String DonneLeType() {
		return typeDePorte;
	}

	public boolean verouillage() {
		if (!porteOuverte) {
			
			if (this.verouiller) {
				this.verouiller = true;
				return true;
			} else {
				return false;
			}
		}else {
			return false;
		}
		
		
	}

	public boolean ouvrirEntierement() {
		if (this.porteOuverte) {
			this.porteOuverte = true;
			return true;
		} else {
			return false;
		}

	}

	public boolean fermerEntierment() {
		this.porteOuverte = false;
		return porteOuverte;
	}

	public boolean ouvrir(double tauxOuverture) {
		if (tauxOuverture >= 0.1 && tauxOuverture <= 0.9) {
			return true;
		} else {
			return false;

		}
	}

	@Override
	public String toString() {

		return " nom = " + nom + "couleurDeLaPorte = " + couleurDeLaPorte + " typeDePorte = " +typeDePorte + "verouiller ="
				+ verouiller +  " porteOuverte = " + porteOuverte;
	}
}
