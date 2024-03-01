package Exo.Exo2;

public class Main {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("peugeot", "208", 5, 92);

        System.out.println(maVoiture.getMarque());
        System.out.println(maVoiture.getModele());
        System.out.println(maVoiture.getNbrChevaux());
        System.out.println(maVoiture.getNbrPorte());
        System.out.println(maVoiture.isRoule());
    }
}
