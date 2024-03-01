package Exo.Exo7;

public class TechnicienReseau extends Technicien{
    public TechnicienReseau(String nom, String prenom) {
        super(nom, prenom);
    }

    //Méthode définie dans hérité de la classe mère, elle même hérité d'une
    //autre classe, cette méthode est abstract et doit donc être redéfinie
    //au plus tard dans l'enfant qui sera instancié
    @Override
    public void saluer() {
        System.out.println("Bonjour je suis "+this.getNom()+ " "+this.getPrenom()+" votre Technicien");

    }

    public void donnerSonC4(){
        System.out.println("Je me casse");
    }
}
