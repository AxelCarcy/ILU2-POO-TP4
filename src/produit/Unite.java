package produit;

public enum Unite {
	LITRE("L"), GRAMME("g"), KILOGRAMME("kg"), CENTILITRE("cl"), MILLILITRE("ml"), PIECE("pièce");

	private String nom;
	
	private Unite(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString(){
		return nom;
	}
}