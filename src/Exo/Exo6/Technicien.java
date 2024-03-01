package Exo.Exo6;

public class Technicien extends Personne{
    public Technicien(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void saluer(){
        System.out.println("Bonjour je suis "+this.getNom()+ " "+this.getPrenom()+" votre Technicien");
    }
}
