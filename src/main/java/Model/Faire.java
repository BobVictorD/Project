package Model;

import javax.persistence.*;
import java.util.List;

/**
 * Classe representant les activités faite pour un utilisateur avec les spots associés et le niveau
 * Classe de mappage
 */
@Entity
public class Faire {
    private int id;
    private Activite activite;
    private List<Spot> spots;
    private Niveau niveau;
    private User user;

    //<editor-fold desc="get/set">
    @Id
    @GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToOne(mappedBy = "faire", cascade = CascadeType.PERSIST)
	public Activite getActivite() {
		return activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}

	@OneToMany(mappedBy = "faire", cascade = CascadeType.PERSIST)
	public List<Spot> getSpots() {
		return spots;
	}

	public void setSpots(List<Spot> spots) {
		spots = spots;
	}

    @OneToOne(mappedBy = "faire", cascade = CascadeType.PERSIST)
    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
	//</editor-fold>
}