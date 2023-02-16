package ACKC;

//import ACKC.BrasRobotique;
//import ACKC.Outil;
//import ACKC.Plateau;


public class Capteur {
	private Plateau plateau;
	private BrasRobotique brasRobotique;
	private Outil outil;
	private Capteur[] capteurs;
    private double distance;
    public int getDistance() {
    	
    	return 0; }

    public Capteur(double distance) {
        this.distance = distance;
    }
    public class DistanceSensor {
        private double distance;

        public double getDistance() {
            return distance;
        }
    }
	
	public Capteur(Plateau plateau, BrasRobotique brasRobotique, Outil outil, Capteur[] capteurs) {
		this.plateau = plateau;
		this.brasRobotique = brasRobotique;
		this.outil = outil;
		this.capteurs = capteurs;
	}

	public boolean detecterObstacle() {
		for (Capteur capteur : capteurs) {
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

