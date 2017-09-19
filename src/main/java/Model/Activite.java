package Model;

import javax.persistence.*;

/**
 *Classe représentant les activitées que les utilisateurs peuvent faire.
 */
@Entity
public class Activite {
    private int id;
    private String libelle;
    private Faire faire;

    //<editor-fold desc="get/set">
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @OneToOne
    public Faire getFaire() {
        return faire;
    }

    public void setFaire(Faire faire) {
        this.faire = faire;
    }
    //</editor-fold>

}