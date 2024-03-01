package Demo.Interface;

public class Personne implements SuperInterface{

    @Override
    public void saluer(){
        System.out.println("Bonjour");
    }

    @Override
    public double multiplication(double nombre1, double nombre2){

        return nombre1 * nombre2;
    }

    public void saluer(String nom){
        System.out.println("Bonjour "+nom);
    }

    public void bye(){
        System.out.println("bye bye");
    }

    public int calcul(int nbr){
        return nbr + 2;
    }
}
