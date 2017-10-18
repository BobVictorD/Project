package Application.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Classe representant les activités faite pour un utilisateur avec les spots associés et le niveau
 * Classe de mappage
 */
@Entity
public class Faire {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name="ACTIVITE_ID")
    private Activite activite;

    @ManyToOne
    @JoinColumn(name="PERSONNE_ID")
    private User user;


    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "FAIRE_SPOT", joinColumns = @JoinColumn(name = "FAIRE_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "SPOT_ID", referencedColumnName = "ID"))
    private List<Spot> spots;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="NIVEAU_ID")
    private Niveau niveau;


    //<editor-fold desc="get/set">

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Activite getActivite() {
		return activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}


	public List<Spot> getSpots() {
		return spots;
	}

	public void setSpots(List<Spot> spots) {
		spots = spots;
	}


    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
	//</editor-fold>
}