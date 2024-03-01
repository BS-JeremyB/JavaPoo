package Demo.Poo;

import java.util.HashMap;
import java.util.UUID;

public class SPA {

    private HashMap<String, Animal> mesAnimaux = new HashMap<>();
    private String nom;


    public HashMap<String, Animal> getMesAnimaux() {
        return mesAnimaux;
    }

    public void setMesAnimaux(HashMap<String, Animal> mesAnimaux) {
        this.mesAnimaux = mesAnimaux;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void ajouter(Animal a){
        String id = UUID.randomUUID().toString();
        mesAnimaux.put(id, a);
    }
}
