package Demo.Abstract;

public class Main {
    public static void main(String[] args) {

        Bateau titanic = new Bateau("MSC", "Titanic",200);

        titanic.seDeplacer();
        titanic.klaxonner();
        System.out.println(titanic.marque);
        System.out.println(titanic.modele);

    }
}
