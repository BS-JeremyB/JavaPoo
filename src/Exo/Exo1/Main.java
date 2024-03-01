package Exo.Exo1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Personne p = new Personne();

        p.setNom("Bazin");
        p.setPrenom("Jeremy");
        p.setMail("bazin@mail.be");
        p.setDateNaiss(LocalDate.of(1990,6,19));

        p.sePresenter();



    }
}
