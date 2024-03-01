package Demo.Stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> noms = Arrays.asList("Jean-Christophe","Adam","Melissande","Marine","Gregory","Fabian","Thomas","Rolande");

        //Filtrer par les nom qui commencent par "M"
        List<String> nomsFiltre = noms.stream()
                .filter(nom ->nom.startsWith("M"))
                .limit(1)
                .map(nom -> nom.toUpperCase())
                .toList();

        for(String nom : nomsFiltre){
            System.out.println(nom);
        }

        //Mettre tous les noms en majuscule
        List<String> nomsMaj = noms.stream()
                //map(s -> s.toUpperCase())
                .map(String::toUpperCase)
                .toList();

        for(String nom : nomsMaj){
            System.out.println(nom);
        }

    }
}
