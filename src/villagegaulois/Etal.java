package villagegaulois;

import personnages.Gaulois;
import personnages.Personnage;
import produit.IProduit;
import produit.Produit;

public class Etal <T extends Produit> implements IEtal {
	private Gaulois vendeur;
	private T[] produits;
	private int nbProduit;
	private int prix;
	private boolean etalOccupe = false;

	public boolean isEtalOccupe() {
		return etalOccupe;
	}
	
	public int getQuantite() {
		return nbProduit;
	}
	

	
	public void installerVendeur(Gaulois vendeur, T[] produits, int prix) {
		this.vendeur = vendeur;
		this.prix = prix;
		this.nbProduit = Integer.valueOf(produits[produits.length-1].toString());
		this.produits = produits;
	}
	public void libererEtal() {
		etalOccupe = false;
	}
	@Override
	public int contientProduit(String produit, int quantiteSouhaitee) {
		int quantiteAVendre = 0;
		if (nbProduit != 0 && this.produits[0].getNom().equals(produit)) {
			if (nbProduit >= quantiteSouhaitee) {
				quantiteAVendre = quantiteSouhaitee;
			} else {
				quantiteAVendre = nbProduit;
			}
		}
		return quantiteAVendre;
	}
	@Override
	public double acheterProduit(int quantiteSouhaite) {
		double prixPaye = 0;
		for (int i = nbProduit - 1; i > nbProduit - quantiteSouhaite - 1 || i > 1; i--) {
				prixPaye += produits[i].calculerPrix(prix);
		}
		if (nbProduit >= quantiteSouhaite) {
			nbProduit -= quantiteSouhaite;
		} else {
			nbProduit = 0;
		}
		return prixPaye;
	}
	
	@Override
	public String etatEtal() {
		StringBuilder chaine = new StringBuilder(vendeur.getNom());
		if (nbProduit > 0) {
			chaine.append(" vend ");
			chaine.append(nbProduit + " produits :");
			for (int i = 0; i < nbProduit; i++) {
				chaine.append("\n- " + produits[i].description());
			}
		} else {
			chaine.append(" n'a plus rien � vendre.");
		}
		chaine.append("\n");
		return chaine.toString();
	}
	@Override
	public Gaulois getVendeur() {
		return vendeur;
	}
	@Override
	public double donnerPrix() {
		return prix;
	}

}
