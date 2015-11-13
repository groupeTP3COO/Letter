/**
 * 
 */
package letter;

/**
 * @author user
 *
 */
public class RegisteredLetter extends Letter<Letter<?>> {

	/**
	 * @param sender
	 * @param receiver
	 * @param letter
	 */
	public RegisteredLetter(Letter<?> letter) {
		super(letter.getSender(), letter.getReceiver(), letter);
	}

	/* 
	 * @see letter.Letter#action()
	 */
	@Override
	public void action() {
		this.content.action();
		Letter<?> letter= new acknowledgementOfReceipt(this);
		this.getReceiver().getCity().sendLetter(letter);
	}

	/* 
	 * @see letter.Letter#getCost()
	 */
	@Override
	public int getCost() {
		return this.getContent().getCost() + 1500;
	}

	@Override
	public String typeOfLetterDescription() {
		return "registered letter";
	}

}
