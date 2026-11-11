abstract class Produit {
    public abstract void methodeProduit();
}

abstract class ProduitFactory {
    public Produit getProduit(){
        return createProduit();
    }
    protected abstract Produit createProduit();
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
class ProduitFactoryA extends ProduitFactory{
    @Override
    protected Produit createProduit() {
        Produit produit = null;
        produit = new ProduitA();
        return produit;
    }
}

class ProduitFactoryB extends ProduitFactory{
    @Override
    protected Produit createProduit() {
        Produit produit = null;
        produit = new ProduitB();
        return produit;
    }
}

class ProduitFactoryC extends ProduitFactory{
    @Override
    protected Produit createProduit() {
        Produit produit = null;
        produit = new ProduitC();
        return produit;
    }
}

class ProduitFactoryD extends ProduitFactory{
    @Override
    protected Produit createProduit() {
        Produit produit = null;
        produit = new ProduitD();
        return produit;
    }
}

class Client {
    public static void main(String[] args){
        System.out.println("Method 2: Abstract Factory");

        ProduitFactory produitFactoryA = new ProduitFactoryA();
        ProduitFactory produitFactoryB = new ProduitFactoryB();
        ProduitFactory produitFactoryC = new ProduitFactoryC();
        ProduitFactory produitFactoryD = new ProduitFactoryD();

        Produit produit;

        produit = produitFactoryA.getProduit();
        produit.methodeProduit();

        produit = produitFactoryB.getProduit();
        produit.methodeProduit();

        produit = produitFactoryC.getProduit();
        produit.methodeProduit();

        produit = produitFactoryD.getProduit();
        produit.methodeProduit();
    }
}