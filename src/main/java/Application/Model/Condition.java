package Application.Model;


import javax.persistence.*;

/**
*Classe représentant les condition d'un spot a un instant T
 */
@Entity
public class Condition {
	@Id
	@GeneratedValue
	private int id;
	private String temps;
	//temperature en °C
	private int temperature;
	//les vent sont en noeuds
	private int vent;
	//la houle en m
	private int houle;
    @OneToOne(fetch = FetchType.LAZY)
    private Spot spot;

    //<editor-fold desc="get/set">
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTemps() {
		return temps;
	}

	public void setTemps(String temps) {
		this.temps = temps;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temptemperature) {
		this.temperature = temperature;
	}

	public int getVent() {
		return vent;
	}

	public void setVent(int vent) {
		this.vent = vent;
	}

	public int getHoule() {
		return houle;
	}

	public void setHoule(int houle) {
		this.houle = houle;
	}

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }
	//</editor-fold>


}