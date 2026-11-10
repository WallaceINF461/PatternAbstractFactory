package construction.abstractFactory;

public class FabriqueConcrete1 extends FabriqueAbstraite {

    public ProduitA CreerProduitA() {
        return new ProduitA1();
    }

    public ProduitB CreerProduitB() {
        return new ProduitB1();
    }

    public ProduitC CreerProduitC() {
        return new ProduitC1();
    }
}
