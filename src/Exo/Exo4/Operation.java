package Exo.Exo4;

public class Operation {
    public static double operation(double nbr){
        return nbr * 2;
    }

    public static double operation(double nbr, double nbr2){
        return nbr * nbr2;
    }

    //Lors d'une surcharge de méthode je peux aussi changer le type de retour
    //à la condition que la signature (nom (params)) possède des params différents
    public static int operation(int nbr, int nbr2){

        return nbr * nbr2;
    }

}
