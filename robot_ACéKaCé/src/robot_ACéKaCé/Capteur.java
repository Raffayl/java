<<<<<<< HEAD:Robot_ACKC/src/ACKC/Capteur.java
=======
package robot_ACéKaCé;


public class Capteur {
	private Plateau plateau;
	private BrasRobotique brasRobotique;
	private Outil outil;
	private Sensor[] capteurs;

	public Capteur(Plateau plateau, BrasRobotique brasRobotique, Outil outil, Sensor[] capteurs) {
		this.plateau = plateau;
		this.brasRobotique = brasRobotique;
		this.outil = outil;
		this.capteurs = capteurs;
	}

	public boolean detecterObstacle() {
		for (Sensor capteur : capteurs) {
			double distance = capteur.getDistance();
			if (distance < 10) {
				System.out.println("Obstacle détecté");
				return true;
			}
		}
		System.out.println("Aucun obstacle détecté");
		return false;
	}
}

>>>>>>> parent of d714848 (config ACKC):robot_ACéKaCé/src/robot_ACéKaCé/Capteur.java
