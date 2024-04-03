package produit;

public class Produit {
	private String nom;
	private String unité;
	public Produit(String nom,String unité) {
		this.nom = nom;
		this.unité = unité;
	}
	public String getNom() {
		return nom;
	}
	public String description() {
		return "";
	}
	
}
