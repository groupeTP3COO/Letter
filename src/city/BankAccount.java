package city;
/**
 * 
 */

/**
 * @author legrand the class represent a bank account
 */
public class BankAccount {
	protected int amount;

	/**
	 * Constructor
	 */
	public BankAccount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            Credit account to the amount
	 */
	public void credit(int amount) {
		this.amount += amount;
	}

	/**
	 * @param amount
	 *            Debit account to the amount
	 */
	public void debit(int amount) {
		this.amount -= amount;
	}

}
