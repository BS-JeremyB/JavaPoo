package Demo.Poo;

public class Main {
    public static void main(String[] args) {


        Chien milou = new Chien("milou", true, false);
        Peroquet rio = new Peroquet("rio",false, "rouge");
        Peruche peper = new Peruche("peper",false, "blanc");
        SPA spaCharleroi = new SPA();

        Animal lepin = new Animal("Petit lepin", true);





        spaCharleroi.setNom("Spa de Charleroi");
        System.out.println(spaCharleroi.getNom());

        spaCharleroi.ajouter(milou);
        spaCharleroi.ajouter(rio);
        spaCharleroi.ajouter(peper);

        spaCharleroi.getMesAnimaux().forEach((guid, animal)->{
            animal.faitDuBruit();
            if(animal instanceof Peroquet){
                ((Peroquet) animal).voler();
            }

        });







    }
}
