package Demo.Abstract;

public class SousMarin extends Marin{
    public SousMarin(String marque, String modele, int nbHublot) {
        super(marque, modele, nbHublot);
    }

    //Redéfini la méthode de la classe mère qui n'avait pas été implémentée
    //car la classe mère est abstract et hérite d'une autre classe absatract
    //contenant le prototype de seDeplacer(), il faut au plus tard définir
    //La méthode dans la classe enfant qui est instanciable
    @Override
    public void seDeplacer(){
        System.out.println("Je plonge");
    }


}
