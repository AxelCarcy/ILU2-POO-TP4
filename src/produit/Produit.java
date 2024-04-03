package produit;

public abstract class Produit {
	protected String nom;
	protected Unite unite;
	
	protected Produit(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
	
	
	public abstract void description();
}
