package Exo.Exo9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listeDeNombres = Arrays.asList(8, 12, 4, 18, 6, 10, 2, 14, 16, 20);

        int somme = listeDeNombres.stream()
                .sorted()
                .limit(5)
                .mapToInt(nbr -> nbr.intValue())
                .sum();

        System.out.println("La somme des 5 plus petit nombre de mon tableau est : "+ somme);

    }
}
