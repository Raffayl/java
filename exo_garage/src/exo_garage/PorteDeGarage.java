package exo_garage;

public class PorteDeGarage {

	// attributs ------------------------------

	private final String MARQUE;
	private int degreOuverture;
	private final int DEGREMAX;
	private final int DEGREMIN;
	private Boolean verrouille;

	// Constructeurs ---------------------------------
	
	
	// constructeur par défaut
	
	public PorteDeGarage() { 		
		
		this.MARQUE = "ABCD";
		this.degreOuverture = 0;
		this.DEGREMAX = 90;
		this.DEGREMIN = 0;
		this.verrouille = true;
	}

	// constructeur classique

	public PorteDeGarage(String _marque, int _degreOuverture, int _degreMax, int _degreMin, Boolean _verrouille) { 
		
		this.MARQUE = _marque;
		this.degreOuverture = _degreOuverture;
		this.DEGREMAX = _degreMax;
		this.DEGREMIN = _degreMin;
		this.verrouille = _verrouille;
	}

	// Les fonctions --------------------------------------

	// Partiellement ouverte

	public boolean partiellementOuverte() {
		if (this.degreOuverture > this.DEGREMIN && this.degreOuverture < this.DEGREMAX) {
			return true;
		} else {
			return false;
		}
	}
	// partielement fermer

	public boolean partiellementFermer() {
		if (this.degreOuverture < this.DEGREMAX && this.degreOuverture > this.DEGREMIN) {
			return true;
		} else {
			return false;
		}
	}
	// Verrouiller

	public boolean verrouiller() {
		if (this.degreOuverture == DEGREMIN && this.verrouille == false) {
			this.verrouille = true;
			return true;
		} else {
			return false;
		}
	}

	// deverouiller
	public boolean unlock() {
		if (this.degreOuverture == DEGREMAX && this.verrouille == false) {
			this.verrouille = false;
			return false;
		} else {
			return true;
		}
	}
	// Ouvrir

	public boolean ouvrir(int degreOuvertureAjoutee) {
		if (!this.verrouille && degreOuvertureAjoutee > 0
				&& this.degreOuverture + degreOuvertureAjoutee <= this.DEGREMAX) {
			this.degreOuverture += degreOuvertureAjoutee;
			return true;
		} else {
			return false;
		}
	}

	// fermer
	public boolean fermer(int degrefermetureAjoutee) {
		if (degrefermetureAjoutee > 0 && this.degreOuverture - degrefermetureAjoutee >= this.DEGREMIN) {
			this.degreOuverture -= degrefermetureAjoutee;
			return true;
		} else {
			return false;
		}

	}

	// to String ------------------------
	@Override

	public String toString() {

		return "Non Porte de Garage : " + this.MARQUE + "\r\n" + "degré ouverture : " + this.degreOuverture + "\r\n"
				+ "Degré maxi : " + this.DEGREMAX + "\r\n" + "Degré min : " + this.DEGREMIN + "\r\n" + "Vérouillée ? "
				+ this.verrouille;
	}
}
