package letter;

public abstract class LetterwhoContentsLetter extends Letter<Letter<?>> {

	/**
	 * allows the creation of a letter who contains a another letter in
	 * parameter
	 * 
	 * @param letter
	 */
	public LetterwhoContentsLetter(Letter<?> letter) {
		super(letter.getSender(), letter.getReceiver(), letter);
	}

	@Override
	public void action() {
		this.content.action();
	}

}
