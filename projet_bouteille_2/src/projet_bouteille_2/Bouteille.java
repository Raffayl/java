package projet_bouteille_2;

public class Bouteille {

	// declaration des attributs
	public final double capaciteEnLitre;
	public double contenuEnLitre;
	boolean estOuverte;
	public String nom;

	// les methodes

	public boolean ouvrir() {
		if (estOuverte) {
			estOuverte = false;
			return false;
		} else {
			return true;
		}
	}

	public boolean fermer() {
		estOuverte = false;
		return estOuverte;
	}

	public boolean remplirTout() {
		if (estOuverte) {
			if (contenuEnLitre < capaciteEnLitre) {
				contenuEnLitre = capaciteEnLitre;
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

	public boolean remplir(double quantiteEnLitre) {
		if (estOuverte) {
			if (contenuEnLitre + quantiteEnLitre <= capaciteEnLitre) {
				contenuEnLitre += quantiteEnLitre;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public boolean vidertout() {
		if (!estOuverte) {
			return false;
		} else {
			contenuEnLitre = 0;
			return true;
		}
	}

	public boolean vider(double quantiteEnLitre) {
		if (!estOuverte) {
			return false;
		}
		contenuEnLitre -= quantiteEnLitre;
		if (contenuEnLitre < 0) {
			contenuEnLitre = 0;
		}
		return true;
	}

	public String DonneLeNom() {
		return nom;
	}

	// le constructeur par defaut
	public Bouteille() {
		capaciteEnLitre = 1;
		contenuEnLitre = 0;
		estOuverte = true;
		nom = "evian";
	}

// le constructeur classique
	public Bouteille(double _capaciteEnLitre, double _contenuEnLitre, boolean _estOuverte, String _nom) {
		this.capaciteEnLitre = _capaciteEnLitre;
		this.contenuEnLitre = _contenuEnLitre;
		this.estOuverte = _estOuverte;
		this.nom = _nom;

	}

	@override
	public String toString() {

		return "capaciteEnLitre = " + capaciteEnLitre + " contenanceEnLitre = " + contenuEnLitre + " estOuvert = "
				+ estOuverte + " nom = " + nom;

	}

}
