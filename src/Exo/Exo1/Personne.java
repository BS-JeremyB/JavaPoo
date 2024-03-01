package Exo.Exo1;

import java.time.LocalDate;
import java.time.Period;

public class Personne {

    private String nom;
    private String prenom;
    private  String mail;
    private LocalDate dateNaiss;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public void sePresenter(){

        int age = Period.between(this.dateNaiss, LocalDate.now()).getYears();
        System.out.println("Je suis "+this.nom+" "+this.prenom+" et j'ai "+age+" ans");

    }
}
