package Application.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Classe représentant les utilisateurs.
 */
@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;
	private String prenom;
	private String nom;
	@NotNull
	private String login;
	@NotNull
	private String password;
	@JsonIgnore()
    @OneToMany(mappedBy = "user")
	private List<Faire> faires;

    //<editor-fold desc="get/set">
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

    public List<Faire> getFaires() {
		return faires;
	}

	public void setFaires(List<Faire> faires) {
        this.faires = faires;
	}

    //</editor-fold>


}