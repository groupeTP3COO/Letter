package letter;

public abstract class LetterwhoContentsLetter extends Letter<Letter<?>> {

	/**
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
