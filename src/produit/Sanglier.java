package produit;

public class Sanglier extends Produit{
	private int poids;
	private String chasseur;
		
		public Sanglier(int poids, String chasseur) {
			super("sanglier");
			this.poids = poids;
			this.chasseur = chasseur;
		}
		
		@Override
		public void description() {
			System.out.println(nom + " de " + poids + unite + " par " + chasseur);
		}
}
