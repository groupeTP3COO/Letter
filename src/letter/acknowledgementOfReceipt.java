/**
 * 
 */
package letter;

import content.Text;

/**
 * @author user
 *
 */
public class acknowledgementOfReceipt extends Letter<Text> {

	/**
	 * @param RegisteredLetter that you make the acknowledgement of receipt
	 */
	public acknowledgementOfReceipt(RegisteredLetter letter) {
		super(letter.getReceiver(), letter.getSender(), new Text("the letter : "+letter.toString()+"was received"));
	}

	/* 
	 * @see letter.Letter#action()
	 */
	@Override
	public void action() {
	}

	/* 
	 * @see letter.Letter#getCost()
	 */
	@Override
	public int getCost() {
		return 0;
	}

	/* 
	 * @see letter.Letter#typeOfLetterDescription()
	 */
	@Override
	public String typeOfLetterDescription() {
		return "acknowledgementOfReceipt";
	}

	

}
