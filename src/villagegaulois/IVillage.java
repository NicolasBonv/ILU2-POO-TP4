package villagegaulois;

import personnages.Gaulois;
import scenarioTest.Produit;
import scenarioTest.T;
import scenarioTest.ScenarioTest.DepenseMarchand;

public interface IVillage {
	public <P extends Produit> boolean installerVendeur(Etal<P> etal,Gaulois vendeur, P[] produit, int prix);
	public DepenseMarchand[] acheterProduit(String produit,int quantiteSouhaitee);
	}
