/**
 * 
 */
package letter;

/**
 * @author legrand
 *
 */
public class UrgentLetter extends LetterwhoContentsLetter {

	/**
	 * @param letter
	 */
	public UrgentLetter(Letter<?> letter) {
		super(letter);
	}

	/* 
	 * @see letter.Letter#getCost()
	 */
	@Override
	public int getCost() {
		return content.getCost() * 2;
	}

	/* 
	 * @see letter.Letter#typeOfLetterDescription()
	 */
	@Override
	public String typeOfLetterDescription() {
		return "an urgent letter";
	}

}
