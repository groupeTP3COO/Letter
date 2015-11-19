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
	 * @return the bankaccount amount
	 */
	public int getAmountOfBankaccount() {
		return bankaccount.getAmount();
	}

	/**
	 * @param amount
	 * Credit account to the amount
	 */
	public void credit(int amount){
		this.bankaccount.credit(amount);
	}
	
	
	/**
	 * @param amount
	 * Debit account to the amount
	 */
	public void debit(int amount){
		this.bankaccount.debit(amount);
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
}
