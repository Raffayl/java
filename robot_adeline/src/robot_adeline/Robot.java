package robot_adeline;

public class Robot {

	// énumération -------------------------------------------------------------

	public enum enumRobot {
		allerAgauche, allerAdroite, monter, descendre, retournerAuDepart, prelever, deposer;

	}

	// Attributs --------------------------------------------------------------

	private String lettres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public char uneLettre;
	public String nomRobot;

	private String maximumX;
	private int maximumXNb;
	private int minimumXNB = 0;

	private int maximumY;
	private int minimumY = 1;

	private String positionX;
	private int positionXNb;
	private int positionY;

	public Boolean colisSurRobot;

	// Consturcteurs
	// --------------------------------------------------------------------

	// Robot par défaut
	public Robot() {
			this.nomRobot = "Robot Kaz Yeah! SA";
			this.maximumX = "J";
			this.maximumY = 5;
			this.positionX = "A";
			this.positionY = 1;
		}

	// Robot à construire
	public Robot(String _nomRobot, String _maximumX, int _maximumY, String _positionX, int _positionY) {
			this.nomRobot = _nomRobot;
			this.maximumX = _maximumX;
			this.maximumY = _maximumY;
			this.positionX = _positionX;
			this.positionY = _positionY;
		}

	// régler des valeurs
	// -----------------------------------------------------------------------

	public void setPositionX(String _positionX) { // modifier la position horizontale par une lettre
		this.positionX = _positionX;
	}

	public void setPositionY(int _positionY) { // Modofoer la postion verticale avec un nombre
		this.positionY = _positionY;
	}

	// retourner des valeurs
	// -----------------------------------------------------------------------

	// Correspondances entre Lettres et nombres pour l'axe horizontal

	public int correspondanceLettresPositionX() { // correspondance positionX

		for (int i = 0; i < this.lettres.length(); i++) {
			if (this.positionX.equals(lettres)) {
				this.positionXNb = i;
			}
		}
		return this.positionXNb;
	}

	public int correspondanceLettresMaximumX() { // correspondance maximumX

		for (int i = 0; i < this.lettres.length(); i++) {
			if (this.maximumX.equals(lettres)) {
				this.maximumXNb = i;
			}
		}
		return this.maximumXNb;
	}

	// Correspondances entre nombres et lettres pour l'axe horizontal

	public void correspondanceNombresPositionX() { // correspondance position X

		this.uneLettre = this.lettres.charAt(this.positionXNb);
	}

	// un colis est-il présent sur le robot ?

	public boolean getColisSurRobot() {
		return this.colisSurRobot;
	}

	// fonctions
	// -----------------------------------------------------------------------

	// aller à gauche ------

	public boolean allerAgauche(int _positionXNb) {

		if (_positionXNb >= this.minimumXNB && _positionXNb < this.positionXNb) {
			this.positionXNb = _positionXNb;
			return true;
		} else {
			return false;
		}
	}

	// aller à droite --------

	public boolean allerAdroite(int _positionXNb) {
		if (_positionXNb <= this.maximumXNb && _positionXNb > this.positionXNb) {
			this.positionXNb = _positionXNb;
			return true;
		} else {
			return false;
		}
	}

	// monter ----

	public boolean monter(int _positionY) {
		if (_positionY > this.positionY && _positionY <= this.minimumY) {
			this.positionY = _positionY;
			return true;
		} else {
			return false;
		}
	}

	// descendre ----

	public boolean descendre(int _positionY) {
		if (_positionY >= this.maximumY && _positionY < this.positionY) {
			this.positionY = _positionY;
			return true;
		} else {
			return false;
		}
	}

	// retourner au départ -----

	public boolean retournerAuDepart() {
		if (this.positionXNb != this.minimumXNB && this.positionY != this.minimumY) {
			this.positionXNb = this.minimumXNB;
			this.positionY = this.minimumY;
			return true;
		} else {
			return false;
		}
	}

	// pélever un colis -------

	public boolean prelever() {
		if (this.colisSurRobot == false) {
			this.colisSurRobot = true;
			return true;
		} else {
			return false;
		}
	}

	// déposer un colis (un colis ne peut être déposé que au point de départ) ----

	public boolean deposer() {
		if (this.colisSurRobot == true && this.positionXNb == this.minimumXNB && this.positionY == this.minimumY) {
			this.colisSurRobot = false;
			return true;
		} else {
			return false;
		}
	}

	// to string
	// -------------------------------------------------------------------------

	@Override

	public String toString() {

		return "Nom du robot : " + this.nomRobot + "\r\n" + "Casier maximum horizontal : " + this.maximumX + "\r\n"
				+ "Casier maximum vertical : " + this.maximumY + "\r\n"
				+ "Position du robot (horizontale, verticale) : " + this.positionX + ", " + this.positionY + "\r\n"
				+ "--------------------------------------------------------------";
	}

}
