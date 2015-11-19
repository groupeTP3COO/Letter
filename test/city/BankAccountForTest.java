package city;

public class BankAccountForTest extends BankAccount {
	
	int creditDone = 0;
	int debitDone = 0;
	
	public BankAccountForTest(int amount) {
		super(amount);
	}
	
	public int getAmount() {
		return 1;
	}
	
	/**
	 * @param amount
	 * Credit account to the amount
	 */
	public void credit(int amount){
		this.creditDone = amount;
	}
	
	/**
	 * @param amount
	 * Debit account to the amount
	 */
	public void debit(int amount){
		this.debitDone = amount;
	}

}
