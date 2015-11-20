package letter;

import content.Content;
import city.Inhabitant;

/**
 * 
 * @author negmi
 *
 *         this class represent a letter by the sender, the receiver and the
 *         content
 */

public abstract class Letter<T extends Content> implements Content {

	protected T content;
	protected Inhabitant sender;
	protected Inhabitant receiver;

	// The constructor
	public Letter(Inhabitant sender, Inhabitant receiver, T cont) {

		this.sender = sender;
		this.receiver = receiver;
		this.content = cont;
	}

	// Methods
	public abstract void action();

	/**
	 * Returns the letter cost.
	 * 
	 * @return the cost
	 */
	public abstract int getCost();

	/**
	 * Returns the value of the content.
	 * 
	 * @return the content
	 */
	public T getContent() {
		return this.content;

	}

	/**
	 * Returns the value of the sender.
	 * 
	 * @return the sender
	 */
	public Inhabitant getSender() {
		return this.sender;
	}

	/**
	 * Returns the value of the receiver.
	 * 
	 * @return the receiver
	 */
	public Inhabitant getReceiver() {
		return this.receiver;
	}

	public abstract String typeOfLetterDescription();

	public String toString() {
		return typeOfLetterDescription() + " whose contains is " + content.toString();

	}

}