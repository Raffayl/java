package ACKC;


public class App {


    public static void main(String[] args) {
        // Créer un robot avec des valeurs spécifiques pour les paramètres
        BrasRobotique brasRobotique1 = new BrasRobotique();
        Plateau plateau1 = new Plateau();
        Plateau plateau = null;
		BrasRobotique brasRobotique = null;
		Capteur capteur1 = new Capteur(plateau, brasRobotique, new Outil(), new Capteur[]{});
        Outil outil1 = new Outil();
        RobotMenager robot1 = new RobotMenager("Robot1", brasRobotique1, capteur1, plateau1, outil1, new Capteur[]{});

        // Appeler la méthode pour effectuer la tâche du robot
        robot1.effectuerTache();

        // Créer un robot avec des valeurs par défaut pour les paramètres
        RobotMenager robot2 = new RobotMenager();

        // Changer le nom du robot2
        robot2.setNom("RafBot");

        // Changer le plateau associé au robot2
        Plateau plateau2 = new Plateau();
        robot2.setPlateau(plateau2);

        // Appeler la méthode pour effectuer la tâche du robot2
        robot2.effectuerTache();
        
        // Changer le plateau associé au robot2
        robot2.setPlateau(plateau1);
    }
}
