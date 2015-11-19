/**
 * 
 */
package letter;

/**
 * @author user
 *
 */
public class RegisteredLetter extends LetterwhoContentsLetter {

	public RegisteredLetter(Letter<?> letter) {
		super(letter);
	}

	protected final static int additionalCost = 15; 
	
	
	/* 
	 * @see letter.Letter#action()
	 */
	@Override
	public void action() {
		super.action();
		Letter<?> letter= new acknowledgementOfReceipt(this);
		this.getReceiver().sendLetter(letter);
	}

	/* 
	 * @see letter.Letter#getCost()
	 */
	@Override
	public int getCost() {
		return this.getContent().getCost() + additionalCost;
	}

	@Override
	public String typeOfLetterDescription() {
		return "a registered letter";
	}

}
