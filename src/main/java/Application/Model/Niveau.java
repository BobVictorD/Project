package Application.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Classe représentant le niveau d'un utilisateur (condition Min et Max) dans une activité.
 */
@Entity
public class Niveau {
    @Id
    @GeneratedValue
    private int id;
    private int tempMax;
    private int tempsMin;
    private int precipitation;
    private int vagueMax;
    private int vagueMin;
    private int ventMax;
    private int ventMin;
    @JsonIgnore()
    @OneToOne
    private Faire faire;

    //<editor-fold desc="get/set">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVagueMax() {
        return vagueMax;
    }

    public void setVagueMax(int vagueMax) {
        this.vagueMax = vagueMax;
    }

    public int getVagueMin() {
        return vagueMin;
    }

    public void setVagueMin(int vagueMin) {
        this.vagueMin = vagueMin;
    }

    public int getVentMax() {
        return ventMax;
    }

    public void setVentMax(int ventMax) {
        this.ventMax = ventMax;
    }

    public int getVentMin() {
        return ventMin;
    }

    public void setVentMin(int ventMin) {
        this.ventMin = ventMin;
    }

    public Faire getFaire() {
        return faire;
    }

    public void setFaire(Faire faire) {
        this.faire = faire;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getTempsMin() {
        return tempsMin;
    }

    public void setTempsMin(int tempsMin) {
        this.tempsMin = tempsMin;
    }

    public int getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(int precipitation) {
        this.precipitation = precipitation;
    }

    //</editor-fold>
}
