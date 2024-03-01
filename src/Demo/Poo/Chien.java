package Demo.Poo;

public class Chien extends Animal{

    public Chien(String nom, boolean estGentil, boolean aUnPedigre) {
        super(nom, estGentil);
        this.aUnPedigre = aUnPedigre;
    }

    private boolean aUnPedigre;

    public boolean isaUnPedigre() {
        return aUnPedigre;
    }

    public void setaUnPedigre(boolean aUnPedigre) {
        this.aUnPedigre = aUnPedigre;
    }



    //Redéfini la méthode de la classe mère
    @Override
    public void faitDuBruit(){
        System.out.println("Waf Waf");
    }
}
