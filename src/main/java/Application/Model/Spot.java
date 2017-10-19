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
	private long id;
    private String libelle;
    private int region;
    private long xcoord;
    private long ycoord;

	@JsonIgnore()
	@ManyToMany(mappedBy = "spots")
    private List<Faire> faires;

    //<editor-fold desc="get/set">
	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public long getxcoord() {
		return xcoord;
	}

	public void setxcoord(long xcoord) {
		xcoord = xcoord;
	}

	public long getycoord() {
		return ycoord;
	}

	public void setycoord(long ycoord) {
		ycoord = ycoord;
	}

    public List<Faire> getFaires() {
        return faires;
    }

    public void setFaires(List<Faire> faires) {
        this.faires = faires;
    }
	//</editor-fold>


	@Override
	public String toString() {
		return id + "";
	}
}