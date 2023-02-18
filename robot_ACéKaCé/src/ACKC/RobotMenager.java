package ACKC;

public class RobotMenager {

	private String nom;
	private BrasRobotique brasRobotique;

	private Outil outil;

	public RobotMenager() {
		this.nom = "rafbot";
		this.brasRobotique = new BrasRobotique();
		this.outil = Outil.COUTEAU; // Par défaut, on utilise le couteau
	}

	public RobotMenager(String nom, BrasRobotique brasRobotique, Outil outil) {
		this.nom = nom;
		this.brasRobotique = brasRobotique;
		this.outil = outil;
	}

	public void effectuerTache() {
		switch (outil) {
		case COUTEAU:
			outil.saisir(brasRobotique);
			outil.use(brasRobotique);
			outil.lacher(brasRobotique);
			break;
		case FOUET:
			outil.saisir(brasRobotique);
			outil.use(brasRobotique);
			outil.lacher(brasRobotique);
			break;
		case FEUILLE:
			outil.saisir(brasRobotique);
			outil.use(brasRobotique);
			outil.lacher(brasRobotique);
			break;
		default:
			System.out.println("Outil inconnu !");
		}
	}

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

	public Outil getOutil() {
		return outil;
	}

	public void setOutil(Outil outil) {
		this.outil = outil;
	}

	public enum Outil {

		COUTEAU {

			public void use(BrasRobotique brasRobotique) {
				System.out.println("Utilisation du couteau pour couper");
			}
		},
		FOUET {
			public void use(BrasRobotique brasRobotique) {
				System.out.println("Utilisation du fouet pour melanger");
			}
		},
		FEUILLE {

			public void use(BrasRobotique brasRobotique) {
				System.out.println("Utilisation de la FEUILLE pour petrir");
			}
		};

		public abstract void use(BrasRobotique brasRobotique);

		public void saisir(BrasRobotique brasRobotique) {
			brasRobotique.descendre();
			brasRobotique.fermerPince();
		}

		public void lacher(BrasRobotique brasRobotique) {
			brasRobotique.ouvrirPince();
			brasRobotique.remonter();
		}
	}
}
