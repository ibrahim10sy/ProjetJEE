/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author SY
 */
public class Inscrire implements Serializable{
    
    private String nom ;
    private String prenom;
    private String pseudo;
    private String email;
    private String mdp;
    private String confirmer;

    public Inscrire() {
    }

    public Inscrire(String nom, String prenom, String pseudo, String email, String mdp, String confirmer) {
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.email = email;
        this.mdp = mdp;
        this.confirmer = confirmer;
    }
    
    
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

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getConfirmer() {
        return confirmer;
    }

    public void setConfirmer(String confirmer) {
        this.confirmer = confirmer;
    }
    
    
}
