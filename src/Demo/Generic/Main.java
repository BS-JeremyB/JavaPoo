package Demo.Generic;

public class Main {
    public static void main(String[] args) {

        ListeGenerique<String> listeCourse = new ListeGenerique<>();

        listeCourse.ajouter("Pomme");
        listeCourse.ajouter("Limonade");
        listeCourse.ajouter("Savon");
        listeCourse.ajouter("Glace Buzz l'éclair");

        ListeGenerique<Integer> scoreEleve = new ListeGenerique<>();
        scoreEleve.ajouter(5);
        scoreEleve.ajouter(15);
        scoreEleve.ajouter(13);
        scoreEleve.ajouter(18);
        scoreEleve.ajouter(1);
        scoreEleve.ajouter(12);

        ListeGenerique<Boolean> listeSucces = new ListeGenerique<>();
        listeSucces.ajouter(true);
        listeSucces.ajouter(true);
        listeSucces.ajouter(false);
        listeSucces.ajouter(true);


        listeCourse.supprimer("Pomme");
        scoreEleve.supprimer(1);

        scoreEleve.editer(0, 20);

        listeCourse.afficher();
        scoreEleve.afficher();

        scoreEleve.recupererValeur(3);



    }
}
