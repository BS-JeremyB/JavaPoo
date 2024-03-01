package Demo.Abstract;


//Class abstract qui hérite de la classe abstract véhicule
public abstract   class Marin extends Vehicule{
    public Marin(String marque, String modele, int nbHublot) {
        super(marque, modele);
        this.nbHublot = nbHublot;
    }

    public int nbHublot;






}
