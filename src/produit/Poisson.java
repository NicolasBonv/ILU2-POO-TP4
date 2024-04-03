package produit;

public class Poisson implements IProduit {
	private String nom;
	private String datePeche;
	public Poisson(String datePeche) {
		this.nom = "Poisson";
		this.datePeche = datePeche;
	}
	@Override
	public String getNom() {
		return this.nom;
	}
	@Override 
	public String description() {
		return (nom+" pêchés "+datePeche);
	}
	@Override
	public double calculerPrix(int prix) {
		return prix;
	}
}
