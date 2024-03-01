package Demo.Poo;

public class Animal implements IAnimal{

    public Animal(String nom, boolean estGentil) {
        this.nom = nom;
        this.estGentil = estGentil;
    }

    private  String nom;
    private  boolean estGentil;


    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isEstGentil() {
        return estGentil;
    }

    public void setEstGentil(boolean estGentil) {
        this.estGentil = estGentil;
    }

    @Override
    public void faitDuBruit(){
       System.out.println("Yo je suis un animal");
   }
}
