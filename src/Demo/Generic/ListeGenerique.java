package Demo.Generic;

import java.util.ArrayList;
import java.util.List;

public class ListeGenerique<T> {
    private List<T> valeurs = new ArrayList<>();

    //Ajouter une valeur
    public void ajouter(T valeur){
        valeurs.add(valeur);
    }


    //Recuperer une valeur
    public T recupererValeur(int indice){
        return valeurs.get(indice);
    }

    //Afficher toutes les valeurs
    public void afficher(){
        for(T valeur : valeurs){
            System.out.println(valeur);
        }
    }
    //Supprimer une valeur
    public void supprimer(T valeur){
        valeurs.remove(valeur);
    }

    //Editer une valeur
    public void editer(int indice, T valeur){
        valeurs.set(indice,valeur);
    }

}
