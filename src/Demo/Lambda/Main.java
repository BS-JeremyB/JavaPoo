package Demo.Lambda;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();
        HashMap<Integer,String > listeJour = new HashMap<>();

        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);

        listeJour.put(1,"Lundi");
        listeJour.put(2,"Mardi");
        listeJour.put(3,"Mercredi");
        listeJour.put(4,"Jeudi");

        //Parcourir un tableau sans lambdas
        for(int element : liste){
            System.out.println(element);
        }
        System.out.println("---------------------");

        //Demo.Lambda paramètre entre () optionel sauf si multiples

        liste.forEach(e -> System.out.println(e));
        liste.forEach((e) -> System.out.println(e));

        //Si une instruction pas besoin de {}, si une instruction
        //renvoie une valeur est n'est pas entre {}, pas besoin
        //d'indiquer qu'il y a un return, entre {} return obligatoire
        //Sauf si le retour est void
        listeJour.forEach((unTruc,lautreTruc)-> {
            System.out.println(unTruc);
            System.out.println(lautreTruc);
        });







    }
}
