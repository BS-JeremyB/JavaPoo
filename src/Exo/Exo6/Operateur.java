package Exo.Exo6;

public class Operateur extends Personne{
    public Operateur(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void saluer(){
        System.out.println("Bonjour, "+this.getNom()+ " "+this.getPrenom()+", comment puis-je vous aider");
    }
}
