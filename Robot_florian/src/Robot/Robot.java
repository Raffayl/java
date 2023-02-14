package Robot;

public class Robot {
	private double coordonneeXEnM;
	private double coordonneeYEnM;
	private double angleEnDegres;
	private boolean brasGaucheLeve;
	private boolean pinceFermee;
	private boolean brasDroitLeve;
	private boolean lanterneAllumee;

	public Robot() {
		this.coordonneeXEnM = 0;
		this.coordonneeYEnM = 0;
		this.angleEnDegres = 0;
		this.brasGaucheLeve = false;
		this.pinceFermee = false;
		this.brasDroitLeve = false;
		this.lanterneAllumee = false;
	}

	// TOURNER SUR SOI
	// Tourner à gauche d'un angle en degrés
	public boolean tournerAGauche(double deltaAngleEnDegres) {
		if (deltaAngleEnDegres > 0) {
			this.angleEnDegres += deltaAngleEnDegres;
			while (this.angleEnDegres >= 360) {
				this.angleEnDegres -= 360;
			}
			return true;
		} else {
			return false;
		}
	}

	// Tourner à droite d'un angle en degrés
	public boolean tournerADroite(double deltaAngleEnDegres) {
		if (deltaAngleEnDegres > 0) {
			this.angleEnDegres -= deltaAngleEnDegres;
			while (this.angleEnDegres < 0) {
				this.angleEnDegres += 360;
			}
			return true;
		} else {
			return false;
		}
	}

	// AVANCER ET RECULER
	// Avancer d'une distance en mètres
	public boolean avancer(double distanceEnM) {
		double angleEnRadians = this.angleEnDegres * Math.PI / 180;
		this.coordonneeXEnM += Math.cos(angleEnRadians) * distanceEnM;
		this.coordonneeYEnM += Math.sin(angleEnRadians) * distanceEnM;
		return true;
	}

	// Reculer d'une distance en mètres
	public boolean reculer(double distanceEnM) {
		double angleEnRadians = this.angleEnDegres * Math.PI / 180;
		this.coordonneeXEnM -= Math.cos(angleEnRadians) * distanceEnM;
		this.coordonneeYEnM -= Math.sin(angleEnRadians) * distanceEnM;
		return true;
	}

	// LEVER OU BAISSER LES BRAS
	// Lever le bras gauche
	public boolean leverBrasGauche() {
		if (!this.brasGaucheLeve) {
			this.brasGaucheLeve = true;
			return true;
		} else {
			return false;
		}
	}

	// Baisser le bras gauche
	public boolean baisserBrasGauche() {
		if (this.brasGaucheLeve) {
			this.brasGaucheLeve = false;
			return true;
		} else {
			return false;
		}
	}

	// Lever le bras droit
	public boolean leverBrasDroit() {
		if (!this.brasDroitLeve) {
			this.brasDroitLeve = true;
			return true;
		} else {
			return false;
		}
	}

	// Baisser le bras droit
	public boolean baisserBrasDroit() {
		if (this.brasDroitLeve) {
			this.brasDroitLeve = false;
			return true;
		} else {
			return false;
		}
	}

	// UTILISER LES OUTILS
	// fermer la pince de la main gauche
	public boolean fermerPince() {
		if (!this.pinceFermee) {
			this.pinceFermee = true;
			return true;
		} else {
			return false;
		}
	}

	// ouvrir la pince de la main gauche
	public boolean ouvrirPince() {
		if (this.pinceFermee) {

			this.pinceFermee = false;
			return true;
		} else {
			return false;
		}
	}
	// allumer la lanterne de la main droite

	public boolean allumerLanterne() {
		if (!this.lanterneAllumee) {
			this.lanterneAllumee = false;
			return true;
		} else {
			return false;
		}
	}
	// eteindre la lanterne de la main droite

	public boolean eteindreLanterne() {
		if (this.lanterneAllumee) {
			this.lanterneAllumee = true;
			return true;
		} else {
			return false;
		}
	}
	// TO STRING
	@Override
	public String toString() {

		return "Coordonnees X (en m) : " + this.coordonneeXEnM + "\nCoordonnees Y (en m) : " + this.coordonneeYEnM
				+ "\nAngle (en degres) : " + this.angleEnDegres + "\nBras gauche leve : " + this.brasGaucheLeve
				+ "\nBras droit leve : " + this.brasDroitLeve + "\nPince femeee : " + this.pinceFermee
				+ "\nLanterne allumee : " + this.lanterneAllumee + "\n---------------------";

	}

}