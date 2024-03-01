package Demo.Poo;

public class Peroquet extends Animal{
    public Peroquet(String nom, boolean estGentil, String couleurDominante) {
        super(nom, estGentil);
        this.couleurDominante = couleurDominante;
    }

    private String couleurDominante;

    //Méthode spécifique à la classe fille
    public void voler(){
        System.out.println("s'envoler");
    }

}
