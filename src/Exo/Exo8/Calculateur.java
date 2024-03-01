package Exo.Exo8;

public class Calculateur implements IAfficher,ICalculer{

    public Calculateur(int nbr1, int nbr2) {
        this.nbr1 = nbr1;
        this.nbr2 = nbr2;
    }

    private int nbr1;
    private int nbr2;

    @Override
    public int calculer(){
        return nbr1 + nbr2;
    }

    @Override
    public void afficher(){

        System.out.println("Voici la somme des deux nombre de l'objet : " + calculer());

    }
}
