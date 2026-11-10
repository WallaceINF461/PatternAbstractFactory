package construction.abstractFactory;

public class Client {

    public static void main(String[] args) {
        FabriqueAbstraite fabrique1 = new FabriqueConcrete1();
        FabriqueAbstraite fabrique2 = new FabriqueConcrete2();
        FabriqueAbstraite fabrique3 = new FabriqueConcrete3();

        ProduitA produitA = null;
        ProduitB produitB = null;
        ProduitC produitC = null;

        System.out.println("Utilisation de la première fabrique");
        produitA = fabrique1.CreerProduitA();
        produitB = fabrique1.CreerProduitB();
        produitC = fabrique1.CreerProduitC();
        produitA.methodeA();
        produitB.methodeB();
        produitC.methodeC();

        System.out.println("Utilisation de la seconde fabrique");
        produitA = fabrique2.CreerProduitA();
        produitB = fabrique2.CreerProduitB();
        produitC = fabrique2.CreerProduitC();
        produitA.methodeA();
        produitB.methodeB();
        produitC.methodeC();

        System.out.println("Utilisation de la troisième fabrique");
        produitA = fabrique3.CreerProduitA();
        produitB = fabrique3.CreerProduitB();
        produitC = fabrique3.CreerProduitC();
        produitA.methodeA();
        produitB.methodeB();
        produitC.methodeC();
    }
}
