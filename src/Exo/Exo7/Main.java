package Exo.Exo7;

public class Main {
    public static void main(String[] args) {
        TechnicienReseau t = new TechnicienReseau("Jean" ,"Jean");
        Operateur o = new Operateur("Doe", "John");
        Employee e = new Employee("Doe", "Jane");



        t.saluer();
        o.saluer();
        e.saluer();

        o.direBye();
        e.direBye();


    }
}
