/**
 * 
 */
package letter;

import content.Text;

/**
 * Class AcknowledgementOfReceipt in the package letter it's a
 * AcknowledgementOfReceipt letter who contains a SimpleLetter which need to be
 * sent after a RegisteredLetter
 */
public class acknowledgementOfReceipt extends Letter<Text> {

	/**
	 * @param RegisteredLetter
	 *            that you make the acknowledgement of receipt
	 */
	public acknowledgementOfReceipt(RegisteredLetter letter) {
		super(letter.getReceiver(), letter.getSender(), new Text("the letter : " + letter.toString() + "was received"));
	}

	/*
	 * @see letter.Letter#action()
	 */
	@Override
	public void action() {
	}

	/*
	 * @return the cost of a acknowledgementOfReceipt ,it's free.
	 */
	@Override
	public int getCost() {
		return 0;
	}

	/*
	 * @return the type of the letter )
	 */
	@Override
	public String typeOfLetterDescription() {
		return "an acknowledgementOfReceipt";
	}

}
