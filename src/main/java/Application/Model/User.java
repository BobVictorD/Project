package Application.Model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Classe représentant les utilisateurs.
 */
@Entity
public class User {

    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)*/
	private long id;
	private String prenom;
	private String nom;
	@NotNull
	private String login;
	@NotNull
	private String password;
	private List<Faire> activiteFaite;

    //<editor-fold desc="get/set">
    @Id
    @GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    public List<Faire> getActiviteFaite() {
		return activiteFaite;
	}

	public void setActiviteFaite(List<Faire> activiteFaite) {
        this.activiteFaite = activiteFaite;
	}

    //</editor-fold>


}