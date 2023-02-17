package ACKC;

public class Cuve {
	private int capaciteMax;
	private int niveau;

	public Cuve() {
		this.setCapaciteMax(100);
		this.setCapaciteMin(1);
		this.niveau = 0;
	}
	

	private void setCapaciteMin(int i) {
		// TODO Auto-generated method stub
		
	}


	public void remplir(int quantite) {
		if (niveau + quantite > capaciteMax) {
			System.out.println("Erreur : la cuve ne peut pas être remplie au-delà de sa capacité maximale.");
		} else {
			niveau += quantite;
			System.out.println("La cuve a été remplie de " + quantite + " unité(s).");
		}
	}

	public void vider(int quantite) {
		if (niveau - quantite < 0) {
			System.out.println("Erreur : la cuve ne peut pas être vidée en-dessous de son niveau minimal.");
		} else {
			niveau -= quantite;
			System.out.println("La cuve a été vidée de " + quantite + " unité(s).");
		}
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
}