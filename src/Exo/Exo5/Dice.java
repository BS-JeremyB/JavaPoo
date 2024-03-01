package Exo.Exo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Dice {
    public static int diceRoller(int nbrFace, int nbrJet){
        ArrayList<Integer> resultats = new ArrayList<Integer>();
        Random rnd = new Random();

        for(int i = 0; i < nbrJet; i++){

            resultats.add(rnd.nextInt(1, nbrFace +1));
        }


        //Exemple d'utilisation du stream
        //Tri sur la liste, recuperation du nombre d'éléments - 1
        //re-conversion en int pour faire une somme
        int resultat = resultats.stream()
                .sorted(Collections.reverseOrder())//Tri descendant
                .limit(nbrJet-1)
                .mapToInt(Integer::intValue)
                .sum();

        return resultat;
    }
}
