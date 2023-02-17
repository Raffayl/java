package ACKC;

public class App {

   public static void main(String[] args) {

    // Créer un nouveau robot avec les paramètres par défaut
    RobotMenager2 robot = new RobotMenager2();
    
    // Changer le nom du robot
    robot.setNom("RafBot");
    
    // Changer l'outil utilisé par le robot
    robot.setOutil(RobotMenager2.Outil.FOUET);
    
    // Effectuer une tâche avec le robot
    robot.effectuerTache();

}

}