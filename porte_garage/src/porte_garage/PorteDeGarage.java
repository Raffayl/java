package porte_garage;

public class PorteDeGarage {

	private String nom;
	private String couleurDeLaPorte;
	private String typeDePorte;
	private boolean estVerouille;
	private int degresOuverture;
	private int degreMaxDOuverture;
	private int degreMinDOuverture;

	// le constructeur classique

	public PorteDeGarage(String _nom, String _couleurDeLaPorte, String _typeDePorte, boolean _estVerouille,
			int _degresOuverture) {
		this.nom = _nom;
		this.couleurDeLaPorte = _couleurDeLaPorte;
		this.typeDePorte = _typeDePorte;
		this.estVerouille = _estVerouille;
		this.degresOuverture = _degresOuverture;
		this.degreMaxDOuverture = 90;
		this.degreMinDOuverture = 0;
	}

	public boolean EstTotallementOuverte() {
		if (degresOuverture == degreMaxDOuverture) {
			return true;
		}
		return false;
	}

	public boolean EstTotallementFerme() {
		if (degresOuverture == degreMinDOuverture) {
			return true;
		}
		return false;
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

	public boolean verouiller() {
		if (EstTotallementFerme()) {
			if (!this.estVerouille) {
				this.estVerouille = true;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean deverouiller() {
		if (this.EstTotallementFerme()) {
			if (this.estVerouille) {
				this.estVerouille = false;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean ouvrirEntierement() {
		if (!this.EstTotallementOuverte()) {
			if (!this.estVerouille) {
				this.degresOuverture = 90;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public boolean fermerEntierement() {
		if (!this.EstTotallementFerme()) {
			this.degresOuverture = 0;
			return true;
		} else {
			return false;
		}
	}

	public boolean ouvrir(int degres) {

		if (this.EstTotallementFerme()) {
			if (degres >= degreMinDOuverture && degres <= 90) {
				this.degresOuverture = degres;
				return true;
			} else {
				return false;
			}
		} else

		if (this.EstTotallementOuverte()) {
			return false;
		} else {
			int nouveauDegre = this.degresOuverture + degres;
			if (nouveauDegre >= degreMinDOuverture && nouveauDegre <= degreMaxDOuverture) {
				this.degresOuverture = nouveauDegre;
				return true;
			} else {
				return false;
			}
		}
	}

	public boolean fermer(int degres) {
		if (!this.EstTotallementOuverte() && !this.EstTotallementFerme()) {
			if (degres <= degreMaxDOuverture && degres >= degreMinDOuverture) {
				this.degresOuverture -= degres;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public String toString() {

		return " nom = " + nom + " couleurDeLaPorte = " + couleurDeLaPorte + " typeDePorte = " + typeDePorte
				+ " estVerouille =" + estVerouille + " degresOuverture = " + degresOuverture;
	}
}
