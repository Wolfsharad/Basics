package random;

public class Percapita {
	String state;
	String counrty;
	char gender;
	String currency;
	int avgIncome;

	public Percapita(String state, String counrty, char gender, String currency, int avgIncome) {
		super();
		this.state = state;
		this.counrty = counrty;
		this.gender = gender;
		this.currency = currency;
		this.avgIncome = avgIncome;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounrty() {
		return counrty;
	}

	public void setCounrty(String counrty) {
		this.counrty = counrty;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getAvgIncome() {
		return avgIncome;
	}

	public void setAvgIncome(int avgIncome) {
		this.avgIncome = avgIncome;
	}

}
