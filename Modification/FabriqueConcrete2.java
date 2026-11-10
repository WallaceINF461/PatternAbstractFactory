package construction.abstractFactory;

public class FabriqueConcrete2 extends FabriqueAbstraite {

    public ProduitA CreerProduitA() {
        return new ProduitA2();
    }

    public ProduitB CreerProduitB() {
        return new ProduitB2();
    }

    public ProduitC CreerProduitC() {
        return new ProduitC2();
    }
}
