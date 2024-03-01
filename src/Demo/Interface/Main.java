package Demo.Interface;



public class Main {

    public static void main(String[] args) {
        Personne p = new Personne();

        p.saluer("Jean");

        SuperInterface s = new Personne();

        s.saluer();
    }
}
