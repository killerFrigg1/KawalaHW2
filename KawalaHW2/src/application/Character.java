package application;

public class Character {
	private String name;
	private String PESEL;
	private int height;
	private String profession;
	private String race;

	public Character(String name, String PESEL, int height, String profession, String race) {
		this.name = name;
		this.PESEL = PESEL;
		this.height = height;
		this.profession = profession;
		this.race = race;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPESEL() {
		return PESEL;
	}

	public void setPESEL(String PESEL) {
		this.PESEL = PESEL;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

}
