package Application.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Classe représentant les Spot ou l'utilisateur peut faire des activités.
 */
@Entity
public class Spot {
	@Id
	@GeneratedValue
	private int id;
    private String libelle;
    private int region;
    private long Xcoord;
    private long Ycoord;

	@JsonIgnore()
	@ManyToMany(mappedBy = "spots")
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

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

	public long getXcoord() {
		return Xcoord;
	}

	public void setXcoord(long xcoord) {
		Xcoord = xcoord;
	}

	public long getYcoord() {
		return Ycoord;
	}

	public void setYcoord(long ycoord) {
		Ycoord = ycoord;
	}

    public List<Faire> getFaires() {
        return faires;
    }

    public void setFaires(List<Faire> faires) {
        this.faires = faires;
    }
	//</editor-fold>


}