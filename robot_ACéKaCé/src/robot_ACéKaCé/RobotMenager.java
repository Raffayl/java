package robot_ACéKaCé;

public class RobotMenager {

    private String nom;
    public BrasRobotique brasRobotique;
    public Capteur capteur;
    public Plateau plateau;
    public Outil outil;
    public InterfaceUtilisateur interfaceUtilisateur;

    public RobotMenager(String nom, BrasRobotique brasRobotique, Capteur capteur, Plateau plateau, Outil outil,
            InterfaceUtilisateur interfaceUtilisateur) {
        this.nom = nom;
        this.brasRobotique = brasRobotique;
        this.capteur = capteur;
        this.plateau = plateau;
        this.outil = outil;
        this.interfaceUtilisateur = interfaceUtilisateur;
    }

    public void effectuerTache() {
        // Utilise le bras robotique pour saisir l'outil et l'utiliser pour nettoyer le plateau
        brasRobotique.saisir(outil);
        outil.nettoyer(plateau);
        brasRobotique.lacher(outil);

        // Utilise le capteur pour détecter les obstacles et ajuster la position du robot si nécessaire
        if (capteur.detecterObstacle()) {
            brasRobotique.remonter();
            // Ajoute des instructions pour ajuster la position du robot ici
            brasRobotique.descendre();
        }
    }

    // Getters and setters for instance variables
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public BrasRobotique getBrasRobotique() {
        return brasRobotique;
    }

    public void setBrasRobotique(BrasRobotique brasRobotique) {
        this.brasRobotique = brasRobotique;
    }

    public Capteur getCapteur() {
        return capteur;
    }

    public void setCapteur(Capteur capteur) {
        this.capteur = capteur;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public Outil getOutil() {
        return outil;
    }

    public void setOutil(Outil outil) {
        this.outil = outil;
    }

    public InterfaceUtilisateur getInterfaceUtilisateur() {
        return interfaceUtilisateur;
    }

    public void setInterfaceUtilisateur(InterfaceUtilisateur interfaceUtilisateur) {
        this.interfaceUtilisateur = interfaceUtilisateur;
    }
}

class BrasRobotique {
    public void saisir(Outil outil) {
        // Code to pick up the tool with the robot arm
    }

    public void lacher(Outil outil) {
        // Code to release the tool with the robot arm
    }

    public void remonter() {
        // Code to move the robot arm up
    }

    public void descendre() {
        // Code to move the robot arm down
    }
}

class Capteur {
    public boolean detecterObstacle() {
        // Code to detect if there is an obstacle
        return false; // replace with actual implementation
    }
}

class Plateau {
    // Code for the Plateau class
}

class Outil {
    public void nettoyer(Plateau plateau) {
        // Code to clean the Plateau with the tool
    }
}
