abstract class Produit {
    public abstract void methodeProduit();
}

class ProduitA extends Produit {
    public ProduitA() {}

    @Override 
    public void methodeProduit() {
        System.out.println("Je suis un produit de type A");
        System.out.println("produitA.methodeProduit()");
    }
}

class ProduitB extends Produit {
    public ProduitB() {}

    @Override 
    public void methodeProduit() {
        System.out.println("Je suis un produit de type B");
        System.out.println("produitB.methodeProduit()");
    }
}

class ProduitC extends Produit {
    public ProduitC() {}

    @Override 
    public void methodeProduit() {
        System.out.println("Je suis un produit de type C");
        System.out.println("produitC.methodeProduit()");
    }
}

class ProduitD extends Produit {
    public ProduitD() {}

    @Override 
    public void methodeProduit() {
        System.out.println("Je suis un produit de type D");
        System.out.println("produitD.methodeProduit()");
    }
}

class FabriqueProduit {
    public static final String typeA="A";
    public static final String typeB="B";
    public static final String typeC="C";
    public static final String typeD="D";

    public FabriqueProduit(){}

    public Produit createProduit(String type){
        Produit produit;

        switch(type){
            case typeA:
                produit = new ProduitA();
                break;
            case typeB:
                produit = new ProduitB();
                break;
            case typeC:
                produit = new ProduitC();
                break;
            case typeD:
                produit = new ProduitD();
                break;
            default:
                throw new IllegalArgumentException("Type de produit inconnu");
        }
        return produit;
    }
}

class Client {
    public static void main(String[] args){
        System.out.println("Bonjour le monde");

        FabriqueProduit fabriqueProduit = new FabriqueProduit();
        Produit produit;

        produit = fabriqueProduit.createProduit(FabriqueProduit.typeA);
        produit.methodeProduit();

        produit = fabriqueProduit.createProduit(FabriqueProduit.typeB);
        produit.methodeProduit();

        produit = fabriqueProduit.createProduit(FabriqueProduit.typeC);
        produit.methodeProduit();

        produit = fabriqueProduit.createProduit(FabriqueProduit.typeD);
        produit.methodeProduit();
    }
}

