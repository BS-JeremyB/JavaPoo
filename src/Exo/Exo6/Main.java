package Exo.Exo6;

public class Main {
    public static void main(String[] args) {
        Technicien t = new Technicien("Jean" ,"Jean");
        Operateur o = new Operateur("Doe", "John");
        Employee e = new Employee("Doe", "Jane");

        t.saluer();
        o.saluer();
        e.saluer();

    }
}
