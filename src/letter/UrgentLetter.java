/**
 * 
 */
package letter;

/**
 * @author legrand
 *
 */

/**
 * Class UrgentLetter in package letter
 * it's a letter which content a other letter 
 * the cost is the double of other letter
 */
public class UrgentLetter extends LetterwhoContentsLetter {

	/**
	 * @param letter
	 */
	public UrgentLetter(Letter<?> letter) {
		super(letter);
	}

	/**
	 * @return the double of the letter cost
	 */
	@Override
	public int getCost() {
		return content.getCost() * 2;
	}

	/**
	 * @return the type of the letter
	 */
	@Override
	public String typeOfLetterDescription() {
		return "an urgent letter";
	}

}
