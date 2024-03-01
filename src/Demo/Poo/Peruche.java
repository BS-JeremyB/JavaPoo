package Demo.Poo;

public class Peruche extends Animal{
    public Peruche(String nom, boolean estGentil, String couleurDominante) {
        super(nom, estGentil);
        this.couleurDominante = couleurDominante;
    }

    private String couleurDominante;

    //Redéfini la méthode de la classe mère, puis appel la méthode mère avec
    // le super.faitDuBruit()
    @Override
    public void faitDuBruit(){
        System.out.println("Bonjour");
        super.faitDuBruit();
    }

    //Méthode spécifique à la classe fille
    public void voler(){
        System.out.println("s'envoler");
    }


}
