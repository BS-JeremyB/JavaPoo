package Exo.Exo2;

public class Voiture {

    public Voiture(String marque, String modeleVoiture, int nbrPorte, int nbrChevaux){
       this.marque = marque;
       modele = modeleVoiture;
       this.nbrPorte = nbrPorte;
       this.nbrChevaux = nbrChevaux;
       this.roule = true;

    }

    private String marque;
    private String modele;
    private  int nbrPorte;
    private  int nbrChevaux;
    private  String couleur;
    private boolean roule;

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getNbrPorte() {
        return nbrPorte;
    }

    public int getNbrChevaux() {
        return nbrChevaux;
    }

    public String getCouleur() {
        return couleur;
    }

    public boolean isRoule() {
        return roule;
    }
}
