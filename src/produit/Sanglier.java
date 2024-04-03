package produit;

import personnages.Gaulois;

public class Sanglier implements IProduit {
	private String nom;
	private Gaulois chasseur;
	private int poids;
	public Sanglier(int poids, Gaulois chasseur) {
		this.nom = "Sanglier";
		this.chasseur = chasseur;
		this.poids = poids;
	}
	@Override
	public String getNom() {
		return this.nom;
	}
	@Override 
	public String description() {
		return (nom+" de "+poids+" kg chassé par "+chasseur);
	}
	@Override
	public double calculerPrix(int prix) {
		return prix;
	}
}
