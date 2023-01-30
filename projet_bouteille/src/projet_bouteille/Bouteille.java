package projet_bouteille;

public class Bouteille {

	// declaration des attributs
	private final double capaciteEnL;
	private double contenanceEnL;
	private boolean estOuverte;
	private String nom;

	// les methodes

	public boolean ouvrir() {
		estOuverte = true;
		return estOuverte;
	}

	public boolean fermer() {
		estOuverte = false;
		return estOuverte;
	}

	public boolean remplirTout() {
		if (!estOuverte) {
			return false;
		}
		contenanceEnL = capaciteEnL;
		return true;
	}

	public boolean remplir(double quantiteEnL) {
		if (!estOuverte) {
			return false;
		}
		contenanceEnL += quantiteEnL;
		if (contenanceEnL > capaciteEnL) {
			contenanceEnL = capaciteEnL;
		}
		return true;
	}

	public boolean vidertout() {
		if (!estOuverte) {
			return false;
		}
		contenanceEnL = 0;
		return true;
	}

	public boolean vider(double quantiteEnL) {
		if (!estOuverte) {
			return false;
		}
		contenanceEnL -= quantiteEnL;
		if (contenanceEnL < 0) {
			contenanceEnL = 0;
		}
		return true;
	}

	public String DonneLeNom() {
		return nom;
	}

	// Le constructeur par defaut
	public Bouteille() {
		capaciteEnL = 1;
		contenanceEnL = 0;
		estOuverte = false;
		nom = "";
	}

	// Le constructeur classique
	public Bouteille(double _capaciteEnL, double _contenanceEnL, boolean _estOuverte, String _Nom) {
		this.capaciteEnL = _capaciteEnL;
		this.contenanceEnL = _contenanceEnL;
		this.estOuverte = _estOuverte;
		this.nom = _Nom;
	}
}
