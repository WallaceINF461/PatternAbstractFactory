package construction.abstractFactory;

public class FabriqueConcrete3 extends FabriqueAbstraite {

    public ProduitA CreerProduitA() {
        return new ProduitA3();
    }

    public ProduitB CreerProduitB() {
        return new ProduitB3();
    }

    public ProduitC CreerProduitC() {
        return new ProduitC3();
    }
}
