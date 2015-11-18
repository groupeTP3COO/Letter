package city;

public class BankAccountForTest extends BankAccount {

	public BankAccountForTest(int amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}
	
	public int getAmount() {
		return 1;
	}
	
	/**
	 * @param amount
	 * Credit account to the amount
	 */
	public void credit(int amount){
		this.amount += 2;
	}
	
	/**
	 * @param amount
	 * Debit account to the amount
	 */
	public void debit(int amount){
		this.amount -= 0;
	}

}
