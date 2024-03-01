package Exo.Exo10;

public class Main {
    public static void main(String[] args) {
        Carwash cw = new Carwash();
        Voiture v = new Voiture("ABC-123");
        Voiture v2 = new Voiture("ABC-222");


        cw.Traiter(v);
        cw.Traiter(v2);

    }
}
