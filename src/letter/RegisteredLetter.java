/**
 * 
 */
package letter;

/**
 * Class RegisteredLetter in package letter
 * a RegisteredLetter with LetterwhoContentsLetter.
 */
public class RegisteredLetter extends LetterwhoContentsLetter {

	public RegisteredLetter(Letter<?> letter) {
		super(letter);
	}

	protected final static int additionalCost = 15; 
	
	
	/**
	 *the receiver send back the Acknowledgment of receipt
	 */
	@Override
	public void action() {
		super.action();
		Letter<?> letter= new acknowledgementOfReceipt(this);
		this.getReceiver().sendLetter(letter);
	}

	/**
	 * @return the cost of a simpleLetter plus 15 
	 */
	@Override
	public int getCost() {
		return this.getContent().getCost() + additionalCost;
	}

	/**
	 * @return the type of the letter
	 */
	@Override
	public String typeOfLetterDescription() {
		return "a registered letter";
	}

}
