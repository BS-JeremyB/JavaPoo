package Demo.Abstract;

public abstract class Vehicule {
    public Vehicule(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    public String marque;
    public String modele;

    public abstract void seDeplacer();

    public void klaxonner(){
        System.out.println("tuuut tuuut");

    }


}
