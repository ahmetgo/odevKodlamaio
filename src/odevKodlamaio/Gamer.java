package odevKodlamaio;

public class Gamer {
	private String identityNumber;
	private String name;
	private String lastName;
	private int birthYear;
	
	public Gamer(String identityNumber, String name, String lastName, int birthYear) {
		this.identityNumber = identityNumber;
		this.name = name;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

}
