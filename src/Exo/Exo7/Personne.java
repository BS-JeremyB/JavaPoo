package Exo.Exo7;

public abstract class Personne {

    private String nom;
    private String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    //Méthode abstract devra obligatoirement être instancié
    //par les classes enfants, sauf si une classe enfant est
    //également abstract.

    //Bon à savoir : Une classe abstract peut contenir des méthodes
    //abstract, non abstract ou les deux.
    //Cependant, une méthode abstract est TOUJOURS dans une classe abstract
    public abstract void saluer();

    public void direBye(){
        System.out.println("bye bye");
    }
}
