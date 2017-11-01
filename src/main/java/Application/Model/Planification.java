package Application.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Planification {

    @Id
    @GeneratedValue
    int id;
    String jour;
    String heure;
    String dateDernierLancement;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateDernierLancement() {
        return dateDernierLancement;
    }

    public void setDateDernierLancement(String dateDernierLancement) {
        this.dateDernierLancement = dateDernierLancement;
    }

    public String getJour() {

        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }
}
