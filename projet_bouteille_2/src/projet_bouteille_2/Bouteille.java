package projet_bouteille_2;


 // La classe Bouteille represente une bouteille, elle contient des informations
 // sur la capacité de la bouteille en litres, son contenu en litres, 
 //son état (ouverte ou fermée) et son nom. 
 // Elle possède des méthodes pour ouvrir et fermer la bouteille, remplir ou vider 
 //tout ou une certaine quantité de liquide, donner son nom, etc.
 

public class Bouteille {

	// declaration des attributs
	//La capacité en litres de la bouteille, définie à la création et non modifiable.
	public final double capaciteEnLitre;
	public double contenuEnLitre;
	boolean estOuverte;
	public String nom;

	// les methodes
	
	
	 // Ouvre la bouteille si elle est fermée, retourne false sinon.
	 // @return false si la bouteille est déjà ouverte, true sinon.
	 

	public boolean ouvrir() {
		if (estOuverte) {
			estOuverte = false;
			return false;
		} else {
			return true;
		}
	}

	
	 // Ferme la bouteille.
	 // @return false, car la bouteille est fermée.
	 
	public boolean fermer() {
		estOuverte = false;
		return estOuverte;
	}

	
	 // Remplit entièrement la bouteille si elle est ouverte et que son contenu est inférieur à sa capacité.
	 // @return true si la bouteille a été remplie, false sinon.
	 
	
	public boolean remplirTout() {
		if (estOuverte) {
			if (contenuEnLitre < capaciteEnLitre) {
				contenuEnLitre = capaciteEnLitre;
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}
	
	 // Remplit la bouteille d'une certaine quantité si elle est ouverte et que le contenu total restera inférieur à sa capacité.
	 // @param quantiteEnLitre La quantité de liquide à ajouter à la bouteille.
	 // @return true si la bouteille a été remplie, false sinon.
	 
		public boolean remplir(double quantiteEnLitre) {
		if (estOuverte) {
			if (contenuEnLitre + quantiteEnLitre <= capaciteEnLitre) {
				contenuEnLitre += quantiteEnLitre;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}
		
		 // Vide entièrement la bouteille si elle est ouverte.
		 // @return true si la bouteille a été vidée, false sinon.
		 
	public boolean vidertout() {
		if (!estOuverte) {
			return false;
		} else {
			contenuEnLitre = 0;
			return true;
		}
	}
	
	 // Vide la bouteille d'une certaine quantité si elle est ouverte.
	 // @paramquantiteEnLitre La quantité de liquide à retirer de la bouteille.
	 // @return true si la bouteille a été vidée, false sinon.
	 
	public boolean vider(double quantiteEnLitre) {
		if (!estOuverte) {
			return false;
		}
		contenuEnLitre -= quantiteEnLitre;
		if (contenuEnLitre < 0) {
			contenuEnLitre = 0;
		}
		return true;
	}
	
	 // Retourne le nom de la bouteille.
	 // @return le nom de la bouteille.
	 
	public String DonneLeNom() {
		return nom;
	}

	// le constructeur par defaut
	public Bouteille() {
		capaciteEnLitre = 1;
		contenuEnLitre = 0;
		estOuverte = true;
		nom = "evian";
	}

	// le constructeur classique
	public Bouteille(double _capaciteEnLitre, double _contenuEnLitre, boolean _estOuverte, String _nom) {
		this.capaciteEnLitre = _capaciteEnLitre;
		this.contenuEnLitre = _contenuEnLitre;
		this.estOuverte = _estOuverte;
		this.nom = _nom;

	}
	
	 //Cette méthode retourne une représentation textuelle de l'objet Bouteille, qui inclut les valeurs de ses attributs.
	 //@return Une chaîne de caractères qui décrit la bouteille.
	 
	@override
	public String toString() {

		return "capaciteEnLitre = " + capaciteEnLitre + " contenanceEnLitre = " + contenuEnLitre + " estOuvert = "
				+ estOuverte + " nom = " + nom;

	}

}
