package Exo.Exo5;

import java.util.Random;

public class Dede {

    //Le static me permet de call la méthode sans instancier la classe
    public static int diceRoller(int nbrFace, int nbrJet) {
        int resultat = 0;
        Random rnd = new Random();

        for (int i = 0; i < nbrJet; i++) {

            resultat += rnd.nextInt(1, nbrFace + 1);
        }

        return resultat;
    }
}
