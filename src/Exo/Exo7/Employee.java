package Exo.Exo7;

public class Employee extends Personne {
    public Employee(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void saluer(){
        System.out.println("Bonjour à tous ! Je suis "+this.getNom()+ " "+this.getPrenom());
    }

    @Override
    public void direBye(){
        System.out.println("Marre de bosser");
        super.direBye();
    }

}
