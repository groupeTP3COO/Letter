package city;

/**
 * 
 */

/**
 * @author legrand
 *
 */
public class Inhabitant {
	protected String name;
	protected City city;
	protected BankAccount bankaccount;
	
	
	
	/**
	 * @param name
	 * @param city
	 * @param bankaccount
	 */
	public Inhabitant(String name, City city, BankAccount bankaccount) {
		this.name = name;
		this.city = city;
		this.bankaccount = bankaccount;
	}

	public Inhabitant(String name) {
		this.name = name;
	}

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}



	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}



	/**
	 * @return the bankaccount
	 */
	public BankAccount getBankaccount() {
		return bankaccount;
	}



	/**
	 * @param bankaccount the bankaccount to set
	 */
	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
}
