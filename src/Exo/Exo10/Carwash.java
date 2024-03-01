package Exo.Exo10;

import java.util.ArrayList;
import java.util.List;

public class Carwash {
    List<Delegate> del = new ArrayList<>();

    //Ajout des méthodes dans la liste d'I-F del, via le constructeur
    public Carwash() {
        del.add((v)-> preparer(v));
        del.add((v)-> laver(v));
        del.add((v)-> secher(v));
        del.add((v)-> finaliser(v));

    }

    private void preparer(Voiture v) {
        System.out.println("Je prépare la voiture : " + v.getPlaque());
    }

    private void laver(Voiture v) {
        System.out.println("Je lave la voiture : " + v.getPlaque());
    }

    private void secher(Voiture v) {
        System.out.println("Je sèche la voiture : " + v.getPlaque());
    }

    private void finaliser(Voiture v) {
        System.out.println("Je finalise la voiture : " + v.getPlaque());
    }

    //Parcours la liste d'I-F et utilise les méthode une à une
    public void Traiter(Voiture v) {
        del.forEach(delegate -> delegate.execute(v));
    }
}