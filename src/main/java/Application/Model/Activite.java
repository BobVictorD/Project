package Application.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 *Classe représentant les activitées que les utilisateurs peuvent faire.
 */
@Entity
public class Activite {

    @Id
    @GeneratedValue
    private int id;
    private String libelle;
    @JsonIgnore()
    @OneToMany(mappedBy = "activite")
    private List<Faire> faires;

    //<editor-fold desc="get/set">
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

    public List<Faire> getFaires() {
        return faires;
    }

    public void setFaires(List<Faire> faires) {
        this.faires = faires;
    }
    //</editor-fold>
}