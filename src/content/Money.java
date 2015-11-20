package content;

/**
 * @author negmi
 * 
 *         this class represent the money in a letter
 *
 */
public class Money implements Content {

	public int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String toString() {
		return "(" + this.amount + ")";
	}

}