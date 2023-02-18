package ACKC;

public class App {

    public static void main(String[] args) {

        // Créer un nouveau robot avec les paramètres par défaut
        RobotMenager robot = new RobotMenager();

        // Changer le nom du robot
        robot.setNom("RafBot");

        // Changer l'outil utilisé par le robot
        robot.setOutil(RobotMenager.Outil.FOUET);

        // Effectuer une tâche avec le robot
        robot.effectuerTache();

        BrasRobotique brasRobotique = robot.getBrasRobotique();
        brasRobotique.remonter();
        brasRobotique.ouvrirPince();
        robot.getOutil().saisir(brasRobotique);
        robot.getOutil().use(brasRobotique);
        brasRobotique.remonter();
        robot.getOutil().lacher(brasRobotique);
        brasRobotique.ouvrirPince();
    }
}
